package com.vk.dialogtags.api;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import xsna.d2o0;
import xsna.shy;
import xsna.vu5;

/* compiled from: TagsFactory.kt */
/* loaded from: classes18.dex */
public interface a {

    /* compiled from: TagsFactory.kt */
    /* renamed from: com.vk.dialogtags.api.a$a, reason: collision with other inner class name */
    public static final class C0896a {
        public static final /* synthetic */ C0896a a = new C0896a();
        private static final a STUB = new C0897a();

        /* compiled from: TagsFactory.kt */
        /* renamed from: com.vk.dialogtags.api.a$a$a, reason: collision with other inner class name */
        public static final class C0897a implements a {
            @Override // com.vk.dialogtags.api.a
            public final View a(FragmentActivity fragmentActivity, long j, b bVar, d2o0 d2o0Var) {
                return new ViewStub(fragmentActivity);
            }
        }

        public final a getSTUB() {
            return STUB;
        }
    }

    /* compiled from: TagsFactory.kt */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewParams(maxHeight=");
            sb.append(this.a);
            sb.append(", xOffset=");
            sb.append(this.b);
            sb.append(", yOffset=");
            return vu5.b(sb, this.c, ')');
        }
    }

    View a(FragmentActivity fragmentActivity, long j, b bVar, d2o0 d2o0Var);
}
