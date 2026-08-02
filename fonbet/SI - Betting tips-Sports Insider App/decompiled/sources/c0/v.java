package c0;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class v {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i5) {
        return builder.setContentType(i5);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i5) {
        return builder.setUsage(i5);
    }
}
