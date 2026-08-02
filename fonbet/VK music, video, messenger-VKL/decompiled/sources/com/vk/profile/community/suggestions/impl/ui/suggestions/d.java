package com.vk.profile.community.suggestions.impl.ui.suggestions;

import java.util.ArrayList;
import xsna.i3i;
import xsna.sd80;
import xsna.xl50;

/* compiled from: CommunitySuggestionsPatch.kt */
/* loaded from: classes5.dex */
public interface d extends xl50 {

    /* compiled from: CommunitySuggestionsPatch.kt */
    public static final class a implements d {
        public final ArrayList b;
        public final String c;

        public a(String str, ArrayList arrayList) {
            this.b = arrayList;
            this.c = str;
        }
    }

    /* compiled from: CommunitySuggestionsPatch.kt */
    public static final class b implements d {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }
    }

    /* compiled from: CommunitySuggestionsPatch.kt */
    public static final class c implements d {
        public final ArrayList b;
        public final String c;
        public final sd80 d;
        public final int e;

        public c(ArrayList arrayList, String str, sd80 sd80Var, int i) {
            this.b = arrayList;
            this.c = str;
            this.d = sd80Var;
            this.e = i;
        }
    }

    /* compiled from: CommunitySuggestionsPatch.kt */
    /* renamed from: com.vk.profile.community.suggestions.impl.ui.suggestions.d$d, reason: collision with other inner class name */
    public static final class C1637d implements d {
        public static final C1637d b = new C1637d();
    }

    /* compiled from: CommunitySuggestionsPatch.kt */
    public static final class e implements d {
        public final i3i b;
        public final int c;

        public e(i3i i3iVar, int i) {
            this.b = i3iVar;
            this.c = i;
        }
    }
}
