package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class o4c {
    public static MediaDescription a(MediaDescription.Builder builder) {
        return builder.build();
    }

    public static MediaDescription.Builder b() {
        return new MediaDescription.Builder();
    }

    @Nullable
    public static CharSequence c(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    @Nullable
    public static Bundle d(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    @Nullable
    public static Bitmap e(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    @Nullable
    public static Uri f(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    @Nullable
    public static String g(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    @Nullable
    public static CharSequence h(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    @Nullable
    public static CharSequence i(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    public static void j(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    public static void k(MediaDescription.Builder builder, @Nullable Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static void l(MediaDescription.Builder builder, @Nullable Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    public static void m(MediaDescription.Builder builder, @Nullable Uri uri) {
        builder.setIconUri(uri);
    }

    public static void n(MediaDescription.Builder builder, @Nullable String str) {
        builder.setMediaId(str);
    }

    public static void o(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static void p(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
