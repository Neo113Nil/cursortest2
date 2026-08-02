package com.ironsource;

import defpackage.wt3;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.z7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4429z7 {
    void a(a aVar);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.z7$a */
    public static class a {
        private final ArrayList<C4355v5> a;
        private boolean b;
        private int c;
        private Exception d;

        public a(ArrayList<C4355v5> arrayList) {
            this.b = false;
            this.c = -1;
            this.a = arrayList;
        }

        public String a() {
            if (this.b) {
                return "";
            }
            return "rc=" + this.c + ", ex=" + this.d;
        }

        public ArrayList<C4355v5> b() {
            return this.a;
        }

        public boolean c() {
            return this.b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("EventSendResult{success=");
            sb.append(this.b);
            sb.append(", responseCode=");
            sb.append(this.c);
            sb.append(", exception=");
            return wt3.o(sb, this.d, '}');
        }

        public a(ArrayList<C4355v5> arrayList, int i, boolean z, Exception exc) {
            this.a = arrayList;
            this.b = z;
            this.d = exc;
            this.c = i;
        }

        public a a(boolean z) {
            return new a(this.a, this.c, z, this.d);
        }

        public a a(int i) {
            return new a(this.a, i, this.b, this.d);
        }

        public a a(Exception exc) {
            return new a(this.a, this.c, this.b, exc);
        }
    }
}
