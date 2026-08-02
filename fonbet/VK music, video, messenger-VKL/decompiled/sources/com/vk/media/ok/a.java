package com.vk.media.ok;

import com.vk.media.ok.b;
import java.util.ArrayList;
import ru.ok.gleffects.recognition.GalleryPanelSettings;

/* compiled from: OkEffects.kt */
/* loaded from: classes3.dex */
public interface a {
    void A();

    void B(boolean z);

    void C();

    void b(boolean z);

    void clearSavedStorage();

    void e(ArrayList<Long> arrayList);

    void f(b.C1263b c1263b);

    void g(boolean z);

    boolean h();

    void i(boolean z);

    void j(boolean z);

    int k(int i);

    void l();

    void m();

    void n(boolean z);

    void o(boolean z, GalleryPanelSettings galleryPanelSettings);

    void onChangeAudioPitch(float f);

    void onChangeMicMute(boolean z);

    void onChangeReadyToStartRecording(boolean z);

    void p(boolean z, boolean z2);

    void q();

    void r(float f);

    void setMusicById(String str);

    void stopRecording();

    void submitTaskOnWorkerThread(Runnable runnable);

    void t();

    void u(boolean z);

    void v(boolean z);

    void w();

    void x(String str);

    void y(boolean z);

    void z(boolean z, boolean z2);
}
