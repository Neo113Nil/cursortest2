package com.vk.profile.community.suggestions.impl.ui.suggestions;

import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;

/* compiled from: CommunitySuggestionsSideEffect.kt */
/* loaded from: classes5.dex */
public interface f {

    /* compiled from: CommunitySuggestionsSideEffect.kt */
    public static final class a implements f {
        public final Group a;
        public final String b;
        public final View c;

        public a(Group group, String str, View view) {
            this.a = group;
            this.b = str;
            this.c = view;
        }
    }

    /* compiled from: CommunitySuggestionsSideEffect.kt */
    public static final class b implements f {
        public final Group a;
        public final String b;

        public b(Group group, String str) {
            this.a = group;
            this.b = str;
        }
    }

    /* compiled from: CommunitySuggestionsSideEffect.kt */
    public interface c extends f {

        /* compiled from: CommunitySuggestionsSideEffect.kt */
        public static final class a implements c {
            public static final a a = new a();
        }

        /* compiled from: CommunitySuggestionsSideEffect.kt */
        public static final class b implements c {
            public final Group a;
            public final String b;

            public b(Group group, String str) {
                this.a = group;
                this.b = str;
            }
        }

        /* compiled from: CommunitySuggestionsSideEffect.kt */
        /* renamed from: com.vk.profile.community.suggestions.impl.ui.suggestions.f$c$c, reason: collision with other inner class name */
        public static final class C1638c implements c {
            public final String a;
            public final String b;
            public final UserId c;

            public C1638c(String str, String str2, UserId userId) {
                this.a = str;
                this.b = str2;
                this.c = userId;
            }
        }
    }

    /* compiled from: CommunitySuggestionsSideEffect.kt */
    public static final class d implements f {
        public final int a;

        public d(int i) {
            this.a = i;
        }
    }
}
