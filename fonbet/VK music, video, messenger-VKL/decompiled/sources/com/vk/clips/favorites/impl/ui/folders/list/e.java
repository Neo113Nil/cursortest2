package com.vk.clips.favorites.impl.ui.folders.list;

import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListState;
import java.util.List;
import xsna.ao50;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.n0u0;
import xsna.yzt0;

/* compiled from: ClipsFavoriteFoldersListViewState.kt */
/* loaded from: classes16.dex */
public final class e implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: ClipsFavoriteFoldersListViewState.kt */
    public static final class a implements fm50<ClipsFavoriteFoldersListState.Content> {
        public final yzt0<List<Object>> a;
        public final yzt0<Boolean> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }
    }

    /* compiled from: ClipsFavoriteFoldersListViewState.kt */
    public static final class b implements fm50<ClipsFavoriteFoldersListState.a> {
        public static final b a = new b();
    }

    /* compiled from: ClipsFavoriteFoldersListViewState.kt */
    public static final class c implements fm50<ClipsFavoriteFoldersListState.b> {
        public static final c a = new c();
    }

    public e(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }

    public final n0u0<a> a() {
        return this.b;
    }

    public final n0u0<b> b() {
        return this.c;
    }

    public final n0u0<c> c() {
        return this.a;
    }
}
