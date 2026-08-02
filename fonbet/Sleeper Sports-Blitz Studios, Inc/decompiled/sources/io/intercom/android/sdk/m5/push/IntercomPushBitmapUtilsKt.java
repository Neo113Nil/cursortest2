package io.intercom.android.sdk.m5.push;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.FileProvider;
import coil.request.ImageRequest;
import coil.transform.CircleCropTransformation;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.NameUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.AvatarDefaultDrawable;
import io.intercom.android.sdk.views.AvatarInitialsDrawable;
import io.sentry.protocol.DebugMeta;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: IntercomPushBitmapUtils.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aj\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2:\u0010\f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\rH\u0000\u001a\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a*\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u000eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"LARGE_ICON_SIZE_DP", "", "BIG_PICTURE_WIDTH_DP", "BIG_PICTURE_HEIGHT_DP", "loadBitmaps", "", "context", "Landroid/content/Context;", "contentImageUrl", "", "avatarImageUrl", "authorName", "onComplete", "Lkotlin/Function2;", "Landroid/graphics/Bitmap;", "Lkotlin/ParameterName;", "name", "contentBitmap", "avatarBitmap", "loadContentBitmapBlocking", "loadAvatarBitmapBlocking", "imageUrl", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "getBitmapUri", "Landroid/net/Uri;", "bitmap", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomPushBitmapUtilsKt {
    private static final float BIG_PICTURE_HEIGHT_DP = 256.0f;
    private static final float BIG_PICTURE_WIDTH_DP = 512.0f;
    private static final float LARGE_ICON_SIZE_DP = 48.0f;

    public static /* synthetic */ void loadBitmaps$default(Context context, String str, String str2, String str3, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        loadBitmaps(context, str, str2, str3, function2);
    }

    public static final void loadBitmaps(Context context, String contentImageUrl, String avatarImageUrl, String authorName, Function2<? super Bitmap, ? super Bitmap, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentImageUrl, "contentImageUrl");
        Intrinsics.checkNotNullParameter(avatarImageUrl, "avatarImageUrl");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        AppConfig appConfig = Injector.get().getAppConfigProvider().get();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new IntercomPushBitmapUtilsKt$loadBitmaps$1(onComplete, new Ref.ObjectRef(), new Ref.ObjectRef(), context, contentImageUrl, avatarImageUrl, authorName, appConfig, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap loadContentBitmapBlocking(Context context, String str) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        int dpToPx = ScreenUtils.dpToPx(BIG_PICTURE_WIDTH_DP, context);
        int dpToPx2 = ScreenUtils.dpToPx(BIG_PICTURE_HEIGHT_DP, context);
        Drawable drawable = AppCompatResources.getDrawable(context, R.drawable.intercom_push_image_load_failes);
        Drawable loadIntercomImageBlocking = IntercomCoilKt.loadIntercomImageBlocking(context, new ImageRequest.Builder(context).dispatcher(Dispatchers.getIO()).data(str).error(drawable).build());
        if (loadIntercomImageBlocking != null) {
            drawable = loadIntercomImageBlocking;
        }
        if (drawable != null) {
            return BitmapUtilsKt.drawableToBitmap(drawable, dpToPx, dpToPx2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap loadAvatarBitmapBlocking(Context context, String str, String str2, AppConfig appConfig) {
        AvatarInitialsDrawable loadIntercomImageBlocking;
        String str3 = str;
        if (StringsKt.isBlank(str3) && StringsKt.isBlank(str2)) {
            return null;
        }
        int dpToPx = ScreenUtils.dpToPx(LARGE_ICON_SIZE_DP, context);
        if (StringsKt.isBlank(str3) && !StringsKt.isBlank(str2)) {
            loadIntercomImageBlocking = AvatarUtils.getInitialsDrawable(NameUtils.getInitial(str2), appConfig);
        } else {
            AvatarDefaultDrawable defaultDrawable = AvatarUtils.getDefaultDrawable(context, appConfig);
            loadIntercomImageBlocking = IntercomCoilKt.loadIntercomImageBlocking(context, new ImageRequest.Builder(context).error(defaultDrawable).transformations(new CircleCropTransformation()).data(str).dispatcher(Dispatchers.getIO()).size(dpToPx, dpToPx).build());
            if (loadIntercomImageBlocking == null) {
                loadIntercomImageBlocking = defaultDrawable;
            }
        }
        Intrinsics.checkNotNull(loadIntercomImageBlocking);
        return BitmapUtilsKt.drawableToBitmap(loadIntercomImageBlocking, dpToPx, dpToPx);
    }

    public static final Uri getBitmapUri(Context context, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        try {
            File file = new File(context.getCacheDir(), DebugMeta.JsonKeys.IMAGES);
            file.mkdirs();
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            File file2 = new File(file, uuid + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), file2);
        } catch (Exception unused) {
            return null;
        }
    }
}
