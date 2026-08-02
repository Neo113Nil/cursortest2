package com.vk.clips.favorites.impl.ui.folders.picker;

import com.vk.dto.common.Image;
import defpackage.q0;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.List;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.urd0;
import xsna.yzt0;

/* compiled from: ClipsFavoritesFoldersPickerViewState.kt */
/* loaded from: classes16.dex */
public final class f implements ao50 {
    public final fi50 a;

    /* compiled from: ClipsFavoritesFoldersPickerViewState.kt */
    public static final class a {
        public final List<Image> a;
        public final String b;
        public final boolean c;

        public a(List<Image> list, String str, boolean z) {
            this.a = list;
            this.b = str;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AllClipsFolder(coverImages=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", isSelected=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerViewState.kt */
    public static abstract class b {

        /* compiled from: ClipsFavoritesFoldersPickerViewState.kt */
        public static final class a extends b {
            public final a a;
            public final ArrayList b;

            public a(a aVar, ArrayList arrayList) {
                this.a = aVar;
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(allClipsFolder=");
                sb.append(this.a);
                sb.append(", items=");
                return j.b(')', sb, this.b);
            }
        }

        /* compiled from: ClipsFavoritesFoldersPickerViewState.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.picker.f$b$b, reason: collision with other inner class name */
        public static final class C0612b extends b {
            public static final C0612b a = new C0612b();
        }

        /* compiled from: ClipsFavoritesFoldersPickerViewState.kt */
        public static final class c extends b {
            public static final c a = new c();
        }

        /* compiled from: ClipsFavoritesFoldersPickerViewState.kt */
        public static final class d extends b {
            public static final d a = new d();
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerViewState.kt */
    public static final class c implements fm50<ClipsFavoritesFoldersPickerState> {
        public final yzt0<b> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public f(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
