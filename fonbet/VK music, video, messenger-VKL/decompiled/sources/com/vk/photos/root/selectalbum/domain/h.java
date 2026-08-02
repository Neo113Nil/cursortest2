package com.vk.photos.root.selectalbum.domain;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.ao50;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.j6i0;
import xsna.yzt0;

/* compiled from: SelectAlbumViewState.kt */
/* loaded from: classes4.dex */
public final class h implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: SelectAlbumViewState.kt */
    public static final class a implements fm50<g> {
        public final yzt0<b> a;
        public final yzt0<Integer> b;
        public final yzt0<Boolean> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }
    }

    /* compiled from: SelectAlbumViewState.kt */
    public static final class b {
        public final boolean a;
        public final List<j6i0> b;
        public final a c;
        public final Throwable d;
        public final boolean e;

        /* compiled from: SelectAlbumViewState.kt */
        public static abstract class a {

            /* compiled from: SelectAlbumViewState.kt */
            /* renamed from: com.vk.photos.root.selectalbum.domain.h$b$a$a, reason: collision with other inner class name */
            public static final class C1514a extends a {
            }

            /* compiled from: SelectAlbumViewState.kt */
            /* renamed from: com.vk.photos.root.selectalbum.domain.h$b$a$b, reason: collision with other inner class name */
            public static final class C1515b extends a {
                public static final C1515b a = new C1515b();
            }
        }

        public b(boolean z, ListBuilder listBuilder, a aVar, Throwable th, boolean z2) {
            this.a = z;
            this.b = listBuilder;
            this.c = aVar;
            this.d = th;
            this.e = z2;
        }
    }

    /* compiled from: SelectAlbumViewState.kt */
    public static final class c implements fm50<g> {
        public static final c a = new c();
    }

    public h(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
