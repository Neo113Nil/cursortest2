package com.vk.voip.ui.groupcalls.list;

import android.util.Size;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;
import xsna.zzz;

/* compiled from: ListDisplayLayoutsGenerator.kt */
/* loaded from: classes7.dex */
public final class a {
    public final zzz a;
    public final b b;
    public final VideoDisplayLayout c;

    /* compiled from: ListDisplayLayoutsGenerator.kt */
    /* renamed from: com.vk.voip.ui.groupcalls.list.a$a, reason: collision with other inner class name */
    public interface InterfaceC2054a {
    }

    public a(zzz zzzVar, Size size, b bVar) {
        this.a = zzzVar;
        this.b = bVar;
        this.c = new VideoDisplayLayout.Builder().setFit(VideoDisplayLayout.Fit.COVER).setWidth(size.getWidth()).setHeight(size.getHeight()).build();
    }
}
