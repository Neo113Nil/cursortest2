package com.mattermost.pasteinputtext;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Patterns;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PasteInputListener.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mattermost/pasteinputtext/PasteInputListener;", "Lcom/mattermost/pasteinputtext/IPasteInputListener;", "editText", "Lcom/mattermost/pasteinputtext/PasteInputEditText;", "surfaceId", "", "<init>", "(Lcom/mattermost/pasteinputtext/PasteInputEditText;I)V", "mEditText", "mSurfaceId", "onPaste", "", "itemUri", "Landroid/net/Uri;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "mattermost_react-native-paste-input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PasteInputListener implements IPasteInputListener {
    private final PasteInputEditText mEditText;
    private final int mSurfaceId;

    public PasteInputListener(PasteInputEditText editText, int i) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.mEditText = editText;
        this.mSurfaceId = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // com.mattermost.pasteinputtext.IPasteInputListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPaste(Uri itemUri, EventDispatcher eventDispatcher) {
        String mimeTypeFromExtension;
        WritableMap writableMap;
        AssetFileDescriptor openAssetFileDescriptor;
        ClipData.Item itemAt;
        Intrinsics.checkNotNullParameter(itemUri, "itemUri");
        Context context = this.mEditText.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        if (reactContext.getContentResolver().getType(itemUri) == null) {
            return;
        }
        String uri = itemUri.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        WritableMap writableMap2 = null;
        if (Intrinsics.areEqual(uri, "content://com.google.android.apps.docs.editors.kix.editors.clipboard")) {
            Object systemService = reactContext.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
            if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) {
                return;
            }
            String htmlText = itemAt.getHtmlText();
            Matcher matcher = Patterns.WEB_URL.matcher(htmlText);
            if (matcher.find()) {
                Intrinsics.checkNotNull(htmlText);
                uri = htmlText.substring(matcher.start(1), matcher.end());
                Intrinsics.checkNotNullExpressionValue(uri, "substring(...)");
            }
        } else if (StringsKt.startsWith$default(uri, "http", false, 2, (Object) null)) {
            new Thread(new PasteInputFileFromUrl(this.mEditText, uri, this.mSurfaceId, eventDispatcher)).start();
            return;
        } else {
            uri = RealPathUtil.INSTANCE.getRealPathFromURI(reactContext, itemUri);
            if (uri == null) {
                return;
            }
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri);
        if (fileExtensionFromUrl == null || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null) {
            return;
        }
        String guessFileName = URLUtil.guessFileName(uri, null, mimeTypeFromExtension);
        Intrinsics.checkNotNullExpressionValue(guessFileName, "guessFileName(...)");
        try {
            openAssetFileDescriptor = reactContext.getContentResolver().openAssetFileDescriptor(itemUri, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
        } catch (FileNotFoundException e) {
            e = e;
        }
        if (openAssetFileDescriptor == null) {
            return;
        }
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        try {
            long length = openAssetFileDescriptor.getLength();
            createMap.putString("type", mimeTypeFromExtension);
            createMap.putDouble("fileSize", length);
            createMap.putString("fileName", guessFileName);
            createMap.putString("uri", "file://" + uri);
            createArray.pushMap(createMap);
            openAssetFileDescriptor.close();
            writableMap = createArray;
        } catch (FileNotFoundException e2) {
            e = e2;
            writableMap2 = createArray;
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("message", e.getLocalizedMessage());
            writableMap = writableMap2;
            writableMap2 = createMap2;
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putArray("data", (ReadableArray) writableMap);
            createMap3.putMap("error", writableMap2);
            if (eventDispatcher == null) {
            }
        }
        WritableMap createMap32 = Arguments.createMap();
        createMap32.putArray("data", (ReadableArray) writableMap);
        createMap32.putMap("error", writableMap2);
        if (eventDispatcher == null) {
            eventDispatcher.dispatchEvent(new PasteTextInputPasteEvent(this.mSurfaceId, this.mEditText.getId(), createMap32));
        }
    }
}
