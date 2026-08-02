package com.vk.core.files;

import java.io.File;
import xsna.agd0;
import xsna.bgd0;
import xsna.bpn0;
import xsna.cgd0;
import xsna.dgd0;
import xsna.egd0;
import xsna.ndi;
import xsna.v0f;
import xsna.yzs;
import xsna.zfd0;

/* compiled from: PrivateStorage.kt */
/* loaded from: classes.dex */
public abstract class c<FileType extends File> {
    public static final bpn0 b = new bpn0(new v0f(8));
    public final yzs<zfd0, PrivateSubdir, Boolean, FileType> a;

    /* compiled from: PrivateStorage.kt */
    public static final class a extends c<File> {
        public static final a c = new a(new agd0());
    }

    /* compiled from: PrivateStorage.kt */
    public static final class b extends c<File> {
        public static final b c = new b(new bgd0());
    }

    /* compiled from: PrivateStorage.kt */
    /* renamed from: com.vk.core.files.c$c, reason: collision with other inner class name */
    public static final class C0768c extends c<File> {
        public static final C0768c c = new C0768c(new cgd0());
    }

    /* compiled from: PrivateStorage.kt */
    public static final class d extends c<File> {
        public static final d c = new d(new dgd0());
    }

    /* compiled from: PrivateStorage.kt */
    /* loaded from: classes17.dex */
    public static final class e extends c<File> {
        public static final e c = new e(new ndi(4));
    }

    /* compiled from: PrivateStorage.kt */
    public static final class f extends c<File> {
        public static final f c = new f(new egd0());
    }

    public c() {
        throw null;
    }

    public c(yzs yzsVar) {
        this.a = yzsVar;
    }
}
