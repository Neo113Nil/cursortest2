package W6;

import android.graphics.drawable.Animatable;

/* loaded from: classes2.dex */
public interface d {
    void onFailure(String str, Throwable th2);

    void onFinalImageSet(String str, Object obj, Animatable animatable);

    void onIntermediateImageFailed(String str, Throwable th2);

    void onIntermediateImageSet(String str, Object obj);

    void onRelease(String str);

    void onSubmit(String str, Object obj);
}
