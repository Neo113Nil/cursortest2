package com.vk.messagetemplates.impl.keyboard;

import java.util.ArrayList;
import xsna.epx;
import xsna.ho8;
import xsna.kr;
import xsna.lm50;
import xsna.urd0;

/* compiled from: TemplatesKeyboardViewState.kt */
/* loaded from: classes3.dex */
public final class h implements lm50 {
    public final ArrayList b;
    public final ButtonState c;

    /* compiled from: TemplatesKeyboardViewState.kt */
    public static final class a {
        public final int a;
        public final String b;
        public final String c;

        public a(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Template(id=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", content=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public h(ArrayList arrayList, ButtonState buttonState) {
        this.b = arrayList;
        this.c = buttonState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.b.equals(hVar.b) && this.c == hVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemplatesKeyboardViewState(templates=");
        kr.d(this.b, sb, ", buttonState=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
