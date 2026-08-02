package com.vk.profile.community.suggestions.impl.ui.suggestions;

import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import xsna.i3i;
import xsna.kj50;

/* compiled from: CommunitySuggestionsAction.kt */
/* loaded from: classes5.dex */
public interface a extends kj50 {

    /* compiled from: CommunitySuggestionsAction.kt */
    /* renamed from: com.vk.profile.community.suggestions.impl.ui.suggestions.a$a, reason: collision with other inner class name */
    public static final class C1636a implements a {
        public static final C1636a b = new C1636a();
    }

    /* compiled from: CommunitySuggestionsAction.kt */
    public static final class b implements a {
        public static final b b = new b();
    }

    /* compiled from: CommunitySuggestionsAction.kt */
    public static final class c implements a {
        public static final c b = new c();
    }

    /* compiled from: CommunitySuggestionsAction.kt */
    public static final class d implements a {
        public final Group b;
        public final String c;

        public d(Group group, String str) {
            this.b = group;
            this.c = str;
        }
    }

    /* compiled from: CommunitySuggestionsAction.kt */
    public static final class e implements a {
        public static final e b = new e();
    }

    /* compiled from: CommunitySuggestionsAction.kt */
    public static final class f implements a {
        public final Group b;
        public final String c;
        public final View d;

        public f(Group group, String str, View view) {
            this.b = group;
            this.c = str;
            this.d = view;
        }
    }

    /* compiled from: CommunitySuggestionsAction.kt */
    public static final class g implements a {
        public final i3i b;

        public g(i3i i3iVar) {
            this.b = i3iVar;
        }
    }

    /* compiled from: CommunitySuggestionsAction.kt */
    public static final class h implements a {
        public final UserId b;
        public final int c;

        public h(UserId userId, int i) {
            this.b = userId;
            this.c = i;
        }
    }
}
