package com.vk.profile.core.content.profilelist;

import android.content.Context;
import android.os.Bundle;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.gzs;
import xsna.h7u0;
import xsna.lv;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: UserMessagesLauncher.kt */
/* loaded from: classes5.dex */
public final class UserMessagesLauncher {
    public final Context a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserMessagesLauncher.kt */
    public static final class DialogType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DialogType[] $VALUES;
        public static final DialogType YOU_BLOCKED_USER;
        public static final DialogType YOU_HAVE_BEEN_BLOCKED;
        private final int femaleMessage;
        private final int maleMessage;
        private final Integer negativeButton;
        private final int positiveButton;
        private final int title = R.string.error;

        static {
            DialogType dialogType = new DialogType("YOU_BLOCKED_USER", 0, R.string.user_profile_add_friend_blacklisted_m, R.string.user_profile_add_friend_blacklisted_f, R.string.user_profile_unblock_and_continue, Integer.valueOf(R.string.cancel));
            YOU_BLOCKED_USER = dialogType;
            DialogType dialogType2 = new DialogType("YOU_HAVE_BEEN_BLOCKED", 1, R.string.user_profile_add_friend_blacklisted_me_m, R.string.user_profile_add_friend_blacklisted_me_f, R.string.ok, null);
            YOU_HAVE_BEEN_BLOCKED = dialogType2;
            DialogType[] dialogTypeArr = {dialogType, dialogType2};
            $VALUES = dialogTypeArr;
            $ENTRIES = new asp(dialogTypeArr);
        }

        public DialogType(String str, int i, int i2, int i3, int i4, Integer num) {
            this.maleMessage = i2;
            this.femaleMessage = i3;
            this.positiveButton = i4;
            this.negativeButton = num;
        }

        public static DialogType valueOf(String str) {
            return (DialogType) Enum.valueOf(DialogType.class, str);
        }

        public static DialogType[] values() {
            return (DialogType[]) $VALUES.clone();
        }

        public final int a(boolean z) {
            return z ? this.femaleMessage : this.maleMessage;
        }

        public final Integer h() {
            return this.negativeButton;
        }

        public final int i() {
            return this.positiveButton;
        }

        public final int j() {
            return this.title;
        }
    }

    /* compiled from: UserMessagesLauncher.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogType.values().length];
            try {
                iArr[DialogType.YOU_BLOCKED_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogType.YOU_HAVE_BEEN_BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UserMessagesLauncher(Context context) {
        this.a = context;
    }

    public final void a(UserProfile userProfile, DialogType dialogType, gzs<s3q0> gzsVar) {
        String string;
        Context context = this.a;
        h7u0.a aVar = new h7u0.a(context);
        aVar.g0(dialogType.j());
        Boolean K = userProfile.K();
        Bundle bundle = userProfile.s;
        int a2 = dialogType.a(K.booleanValue());
        int i = a.$EnumSwitchMapping$0[dialogType.ordinal()];
        if (i == 1) {
            string = bundle.getString("name_acc");
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string = bundle.getString("name_dat");
        }
        aVar.a.f = context.getString(a2, string);
        aVar.c0(dialogType.i(), new lv(gzsVar, 2));
        Integer h = dialogType.h();
        if (h != null) {
            aVar.W(h.intValue(), null);
        }
        aVar.m();
    }
}
