package com.vk.socialgraph;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.socialgraph.SocialGraphStrategy;
import com.vk.socialgraph.init.GeoRequestFragmentContainer;
import com.vk.socialgraph.init.PickAvatarFragment;
import com.vk.socialgraph.init.SocialGraphLoginFragmentNewContainer;
import com.vk.socialgraph.init.TopicsFragmentNewContainer;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.Privacy;
import xsna.e43;
import xsna.hb40;
import xsna.ho8;
import xsna.o25;
import xsna.odk0;
import xsna.xtw;

/* compiled from: SocialGraphStrategyOneShotWithPriority.kt */
/* loaded from: classes5.dex */
public final class a implements SocialGraphStrategy {
    public static final Pattern d = Pattern.compile("https://vk\\.com/images/camera_(\\d+).png\\?ava=1");
    public static String e = "";
    public final FragmentManager a;
    public final ArrayList b;
    public final hb40 c;

    /* compiled from: SocialGraphStrategyOneShotWithPriority.kt */
    /* renamed from: com.vk.socialgraph.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1784a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocialGraphStrategy.Screen.values().length];
            try {
                iArr[SocialGraphStrategy.Screen.CONTACTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocialGraphStrategy.Screen.AVATAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SocialGraphStrategy.Screen.TOPICS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SocialGraphStrategy.Screen.RECOM_THEMES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SocialGraphStrategy.Screen.GEO_REQUEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(FragmentManager fragmentManager, ArrayList arrayList, hb40 hb40Var) {
        this.a = fragmentManager;
        this.b = arrayList;
        this.c = hb40Var;
        e += "Strategy:" + hashCode() + '(' + fragmentManager.hashCode() + ");";
    }

    public static void b(a aVar, Fragment fragment, String str, boolean z, int i) {
        Bundle bundle = Bundle.EMPTY;
        if ((i & 4) != 0) {
            bundle = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        FragmentManager fragmentManager = aVar.a;
        try {
            fragment.setArguments(bundle);
            if (z) {
                int K = fragmentManager.K();
                for (int i2 = 0; i2 < K; i2++) {
                    try {
                        fragmentManager.W();
                    } catch (Throwable unused) {
                    }
                }
            } else {
                try {
                    fragmentManager.Z(-1, 1, str);
                } catch (Throwable unused2) {
                }
            }
            boolean z2 = fragmentManager.G(R.id.vk_fragment_container) == null;
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
            aVar2.g(R.id.vk_fragment_container, fragment, str);
            if (!z2 && !z) {
                aVar2.d(str);
            }
            aVar2.k(true);
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            StringBuilder sb = new StringBuilder("Crash for strategy:");
            sb.append(fragmentManager.hashCode());
            sb.append('(');
            bVar.a(new Exception(ho8.a(sb, e, ')'), th));
            e = "";
        }
    }

    @Override // com.vk.socialgraph.SocialGraphStrategy
    public final void a(SocialGraphStrategy.Screen screen, SocialGraphOpenParams socialGraphOpenParams, boolean z) {
        super.a(null, socialGraphOpenParams, false);
    }

    public final void c(SocialGraphOpenParams socialGraphOpenParams) {
        Bundle bundle = Bundle.EMPTY;
        b(this, new odk0(), "FRIENDS_IMPORT", false, 8);
        super.a(SocialGraphStrategy.Screen.CONTACTS, socialGraphOpenParams, true);
    }

    public final boolean d(SocialGraphStrategy.Screen screen, SocialGraphOpenParams socialGraphOpenParams, boolean z) {
        int i;
        ArrayList arrayList = this.b;
        SocialGraphStrategy.Screen screen2 = null;
        xtw xtwVar = null;
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            xtw xtwVar2 = new xtw(i2, obj);
            if (obj == screen) {
                xtwVar = xtwVar2;
            }
            i2 = i3;
        }
        if (xtwVar != null && (i = xtwVar.a) < e43.h(arrayList)) {
            screen2 = (SocialGraphStrategy.Screen) arrayList.get(i + 1);
        }
        if (screen2 == null) {
            this.c.invoke(socialGraphOpenParams);
            return false;
        }
        if (e(screen2, socialGraphOpenParams, z)) {
            return true;
        }
        return d(screen2, socialGraphOpenParams, z);
    }

    public final boolean e(SocialGraphStrategy.Screen screen, SocialGraphOpenParams socialGraphOpenParams, boolean z) {
        int i = C1784a.$EnumSwitchMapping$0[screen.ordinal()];
        if (i == 1) {
            b(this, new SocialGraphLoginFragmentNewContainer(), Privacy.FRIENDS, z, 4);
            super.a(SocialGraphStrategy.Screen.CONTACTS, socialGraphOpenParams, false);
            return true;
        }
        if (i == 2) {
            String str = o25.a().o().c;
            if (str != null && str.length() != 0 && !d.matcher(str).matches()) {
                return false;
            }
            b(this, new PickAvatarFragment(), "PICK_AVATAR", z, 4);
            super.a(SocialGraphStrategy.Screen.AVATAR, socialGraphOpenParams, false);
            return true;
        }
        if (i == 3 || i == 4) {
            b(this, new TopicsFragmentNewContainer(), "TOPICS", z, 4);
            super.a(SocialGraphStrategy.Screen.TOPICS, socialGraphOpenParams, false);
            return true;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        b(this, new GeoRequestFragmentContainer(), "GEO_REQUEST", false, 12);
        return true;
    }
}
