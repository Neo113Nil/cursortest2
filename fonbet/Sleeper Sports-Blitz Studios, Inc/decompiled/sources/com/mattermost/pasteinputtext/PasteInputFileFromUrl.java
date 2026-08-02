package com.mattermost.pasteinputtext;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.textinput.ReactEditText;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PasteInputFileFromUrl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/mattermost/pasteinputtext/PasteInputFileFromUrl;", "Ljava/lang/Runnable;", TypedValues.AttributesType.S_TARGET, "Lcom/facebook/react/views/textinput/ReactEditText;", "uri", "", "surfaceId", "", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "<init>", "(Lcom/facebook/react/views/textinput/ReactEditText;Ljava/lang/String;ILcom/facebook/react/uimanager/events/EventDispatcher;)V", "mTarget", "mUri", "mEventDispatcher", "mSurfaceId", "run", "", "mattermost_react-native-paste-input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PasteInputFileFromUrl implements Runnable {
    private final EventDispatcher mEventDispatcher;
    private final int mSurfaceId;
    private final ReactEditText mTarget;
    private final String mUri;

    public PasteInputFileFromUrl(ReactEditText target, String uri, int i, EventDispatcher eventDispatcher) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.mTarget = target;
        this.mUri = uri;
        this.mEventDispatcher = eventDispatcher;
        this.mSurfaceId = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0093  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        WritableMap writableMap;
        EventDispatcher eventDispatcher;
        WritableMap writableMap2 = null;
        try {
            URLConnection openConnection = new URL(this.mUri).openConnection();
            String headerField = openConnection.getHeaderField("Content-Type");
            long parseLong = Long.parseLong(openConnection.getHeaderField("Content-Length"));
            String headerField2 = openConnection.getHeaderField(HttpHeaders.CONTENT_DISPOSITION);
            Intrinsics.checkNotNull(headerField2);
            String substring = headerField2.substring(StringsKt.indexOf$default((CharSequence) headerField2, "filename=\"", 0, false, 6, (Object) null) + 10, headerField2.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", headerField);
            createMap.putDouble("fileSize", parseLong);
            createMap.putString("fileName", substring);
            createMap.putString("uri", this.mUri);
            WritableArray createArray = Arguments.createArray();
            try {
                createArray.pushMap(createMap);
                writableMap = createArray;
            } catch (IOException e) {
                e = e;
                writableMap2 = createArray;
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("message", e.getLocalizedMessage());
                writableMap = writableMap2;
                writableMap2 = createMap2;
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putArray("data", (ReadableArray) writableMap);
                createMap3.putMap("error", writableMap2);
                eventDispatcher = this.mEventDispatcher;
                if (eventDispatcher == null) {
                }
            }
        } catch (IOException e2) {
            e = e2;
        }
        WritableMap createMap32 = Arguments.createMap();
        createMap32.putArray("data", (ReadableArray) writableMap);
        createMap32.putMap("error", writableMap2);
        eventDispatcher = this.mEventDispatcher;
        if (eventDispatcher == null) {
            eventDispatcher.dispatchEvent(new PasteTextInputPasteEvent(this.mSurfaceId, this.mTarget.getId(), createMap32));
        }
    }
}
