package com.vk.socialgraph;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import com.vk.socialgraph.SocialGraphStrategy;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.aa70;
import xsna.e43;
import xsna.gz80;
import xsna.n8g;

/* compiled from: SocialGraphUtils.kt */
/* loaded from: classes5.dex */
public final class b {
    public static final ListBuilder a;

    /* compiled from: SocialGraphUtils.kt */
    public static final /* synthetic */ class a {
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

    static {
        new aa70();
        ListBuilder e = e43.e();
        e.add(SocialGraphStrategy.Screen.GEO_REQUEST);
        e.add(SocialGraphStrategy.Screen.CONTACTS);
        e.add(SocialGraphStrategy.Screen.AVATAR);
        e.add(SocialGraphStrategy.Screen.TOPICS);
        a = e.g();
    }

    public static SchemeStatSak$EventScreen a(SocialGraphStrategy.Screen screen, boolean z) {
        if (z) {
            int i = a.$EnumSwitchMapping$0[screen.ordinal()];
            if (i == 1) {
                return SchemeStatSak$EventScreen.REGISTRATION_LIST_ADDRESS_BOOK;
            }
            if (i == 2) {
                return SchemeStatSak$EventScreen.REGISTRATION_PHOTO;
            }
            if (i == 3 || i == 4) {
                return SchemeStatSak$EventScreen.REGISTRATION_SUBJECTS;
            }
            if (i == 5) {
                return SchemeStatSak$EventScreen.REGISTRATION_GEO;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = a.$EnumSwitchMapping$0[screen.ordinal()];
        if (i2 == 1) {
            return SchemeStatSak$EventScreen.REGISTRATION_IMPORT_CONTACTS;
        }
        if (i2 == 2) {
            return SchemeStatSak$EventScreen.REGISTRATION_PHOTO;
        }
        if (i2 == 3 || i2 == 4) {
            return SchemeStatSak$EventScreen.REGISTRATION_SUBJECTS;
        }
        if (i2 == 5) {
            return SchemeStatSak$EventScreen.REGISTRATION_GEO;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean b(View view) {
        Drawable background = view != null ? view.getBackground() : null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        Integer valueOf = colorDrawable != null ? Integer.valueOf(colorDrawable.getColor()) : null;
        return valueOf == null || n8g.f(valueOf.intValue()) >= 0.5d;
    }

    public static void c(View view, boolean z) {
        Window window;
        if (!gz80.a(26) || view == null) {
            return;
        }
        Context context = view.getContext();
        Context context2 = context instanceof Activity ? (Activity) context : null;
        if (context2 == null) {
            Context context3 = view.getContext();
            ContextWrapper contextWrapper = context3 instanceof ContextWrapper ? (ContextWrapper) context3 : null;
            context2 = contextWrapper != null ? contextWrapper.getBaseContext() : null;
        }
        Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
        if (activity == null || (window = activity.getWindow()) == null || !gz80.a(26)) {
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility | 16 : systemUiVisibility & (-17));
    }
}
