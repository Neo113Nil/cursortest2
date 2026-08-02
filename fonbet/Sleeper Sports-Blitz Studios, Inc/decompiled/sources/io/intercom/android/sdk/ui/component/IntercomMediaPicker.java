package io.intercom.android.sdk.ui.component;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.media3.common.MimeTypes;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MediaPickerButton.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\n\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002¢\u0006\u0002\u0010\u0018J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002¢\u0006\u0002\u0010\u0018J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002¢\u0006\u0002\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002¢\u0006\u0002\u0010\u001eJ\u0012\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/ui/component/IntercomMediaPicker;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "mediaType", "Lio/intercom/android/sdk/ui/component/MediaType;", "trustedFileExtensions", "", "maxSelectionCount", "", "<init>", "(Lio/intercom/android/sdk/ui/component/MediaType;Ljava/util/Set;I)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", MetricTracker.Object.INPUT, "parseResult", "resultCode", SDKConstants.PARAM_INTENT, "getIntent", "getVideoMimeTypes", "", "()[Ljava/lang/String;", "getImageMimeTypes", "getDocumentMimeTypes", "getAllMimeTypes", "getPhotoPickerIntent", "supportedTypes", "([Ljava/lang/String;)Landroid/content/Intent;", "getNativePickerIntent", "getClipDataUris", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class IntercomMediaPicker extends ActivityResultContract<String, List<? extends Uri>> {
    private final int maxSelectionCount;
    private final MediaType mediaType;
    private final Set<String> trustedFileExtensions;

    /* compiled from: MediaPickerButton.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.DocumentOnly.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaType.ImageAndVideo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaType.ImageOnly.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MediaType.VideOnly.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IntercomMediaPicker(MediaType mediaType, Set<String> trustedFileExtensions, int i) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(trustedFileExtensions, "trustedFileExtensions");
        this.mediaType = mediaType;
        this.trustedFileExtensions = trustedFileExtensions;
        this.maxSelectionCount = i;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return getIntent(input);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public List<? extends Uri> parseResult(int resultCode, Intent intent) {
        List<Uri> clipDataUris;
        if (resultCode != -1) {
            intent = null;
        }
        return (intent == null || (clipDataUris = getClipDataUris(intent)) == null) ? CollectionsKt.emptyList() : clipDataUris;
    }

    private final Intent getIntent(String input) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.mediaType.ordinal()];
        if (i == 1) {
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").putExtra("android.intent.extra.MIME_TYPES", getAllMimeTypes()).setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", this.maxSelectionCount > 1);
            Intrinsics.checkNotNull(putExtra);
            return putExtra;
        }
        if (i == 2) {
            return getNativePickerIntent(getDocumentMimeTypes());
        }
        if (i == 3) {
            if (MediaPickerButtonKt.isPhotoPickerAvailable()) {
                return getPhotoPickerIntent((String[]) ArraysKt.plus((Object[]) getImageMimeTypes(), (Object[]) getVideoMimeTypes()));
            }
            return getNativePickerIntent((String[]) ArraysKt.plus((Object[]) getImageMimeTypes(), (Object[]) getVideoMimeTypes()));
        }
        if (i == 4) {
            if (MediaPickerButtonKt.isPhotoPickerAvailable()) {
                return getPhotoPickerIntent(getImageMimeTypes());
            }
            return getNativePickerIntent(getImageMimeTypes());
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (MediaPickerButtonKt.isPhotoPickerAvailable()) {
            return getPhotoPickerIntent(getVideoMimeTypes());
        }
        return getNativePickerIntent(getVideoMimeTypes());
    }

    private final String[] getVideoMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "video", false, 2, (Object) null)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final String[] getImageMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "image", false, 2, (Object) null)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final String[] getDocumentMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            String str2 = str;
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) MimeTypes.BASE_TYPE_APPLICATION, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "text", false, 2, (Object) null)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final String[] getAllMimeTypes() {
        Set<String> set = this.trustedFileExtensions;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) it.next());
            if (mimeTypeFromExtension != null) {
                arrayList.add(mimeTypeFromExtension);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final Intent getPhotoPickerIntent(String[] supportedTypes) {
        int pickImagesMaxLimit;
        Intent intent = new Intent("android.provider.action.PICK_IMAGES");
        intent.putExtra("android.intent.extra.MIME_TYPES", supportedTypes);
        int i = this.maxSelectionCount;
        if (i <= 1) {
            return intent;
        }
        pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
        if (i > pickImagesMaxLimit) {
            throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
        }
        intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxSelectionCount);
        return intent;
    }

    private final Intent getNativePickerIntent(String[] supportedTypes) {
        Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType((String) ArraysKt.first(supportedTypes)).putExtra("android.intent.extra.MIME_TYPES", supportedTypes).addFlags(1).putExtra("android.intent.extra.ALLOW_MULTIPLE", this.maxSelectionCount > 1);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        return putExtra;
    }

    private final List<Uri> getClipDataUris(Intent intent) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                Uri uri = clipData.getItemAt(i).getUri();
                if (uri != null) {
                    linkedHashSet.add(uri);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }
}
