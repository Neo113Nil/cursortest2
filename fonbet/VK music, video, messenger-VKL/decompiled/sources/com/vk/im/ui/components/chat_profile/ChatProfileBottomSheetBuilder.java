package com.vk.im.ui.components.chat_profile;

import android.content.Context;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vk.im.ui.components.common.DndPeriodAndSound;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ab;
import xsna.asp;
import xsna.e43;
import xsna.fh1;
import xsna.izs;
import xsna.uf1;
import xsna.xu20;
import xsna.xub;
import xsna.zrp;

/* compiled from: ChatProfilePopups.kt */
/* loaded from: classes2.dex */
public final class ChatProfileBottomSheetBuilder {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatProfilePopups.kt */
    public static final class CallOption {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CallOption[] $VALUES;
        public static final CallOption AUDIO;
        public static final CallOption VIDEO;

        static {
            CallOption callOption = new CallOption(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = callOption;
            CallOption callOption2 = new CallOption(SignalingProtocol.MEDIA_OPTION_AUDIO, 1);
            AUDIO = callOption2;
            CallOption[] callOptionArr = {callOption, callOption2};
            $VALUES = callOptionArr;
            $ENTRIES = new asp(callOptionArr);
        }

        public CallOption() {
            throw null;
        }

        public static CallOption valueOf(String str) {
            return (CallOption) Enum.valueOf(CallOption.class, str);
        }

        public static CallOption[] values() {
            return (CallOption[]) $VALUES.clone();
        }
    }

    public static a.C0785a a(Context context, izs izsVar) {
        List l = e43.l(new Pair(Integer.valueOf(R.string.vkim_msg_header_menu_call_with_audio), CallOption.AUDIO), new Pair(Integer.valueOf(R.string.vkim_msg_header_menu_call_with_video), CallOption.VIDEO));
        a.C0785a c0785a = new a.C0785a();
        ListBuilder e = e43.e();
        int i = 0;
        for (Object obj : l) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            e.add(new ModalActionSheetListItem(i, ModalActionSheetListItem.Appearance.Default, context.getString(((Number) ((Pair) obj).i()).intValue()), null, null, 0, null, false, false, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
            i = i2;
        }
        c0785a.b = e.g();
        c0785a.c = new ab(5, izsVar, l);
        return c0785a;
    }

    public static a.C0785a b(Context context, izs izsVar, boolean z) {
        List l = e43.l(new Pair(Integer.valueOf(R.string.vkim_chat_profile_notifications_option_disable_1hour), DndPeriodAndSound.HOUR), new Pair(Integer.valueOf(R.string.vkim_chat_profile_notifications_option_disable_8hour), DndPeriodAndSound.HOURS_8), new Pair(Integer.valueOf(R.string.vkim_chat_profile_notifications_option_disable_1day), DndPeriodAndSound.DAY), new Pair(Integer.valueOf(R.string.vkim_chat_profile_notifications_option_disable_1week), DndPeriodAndSound.WEEK), new Pair(Integer.valueOf(R.string.vkim_chat_profile_notifications_option_disable_forever), DndPeriodAndSound.FOREVER), z ? new Pair(Integer.valueOf(R.string.vkim_chat_profile_notifications_option_disable_sound), DndPeriodAndSound.DISABLED_SOUND) : new Pair(Integer.valueOf(R.string.vkim_chat_profile_notifications_option_enable_sound), DndPeriodAndSound.ENABLE_SOUND));
        a.C0785a c0785a = new a.C0785a();
        ListBuilder e = e43.e();
        e.add(new xu20(context.getString(R.string.vkim_chat_profile_notifications_title_popup), null, 0, null, 14));
        int i = 0;
        for (Object obj : l) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            e.add(new ModalActionSheetListItem(i, ModalActionSheetListItem.Appearance.Default, context.getString(((Number) ((Pair) obj).i()).intValue()), null, null, 0, null, false, false, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
            i = i2;
        }
        c0785a.b = e.g();
        c0785a.c = new fh1(6, izsVar, l);
        return c0785a;
    }

    public static a.C0785a c(List list, izs izsVar) {
        a.C0785a c0785a = new a.C0785a();
        ListBuilder e = e43.e();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            xub xubVar = (xub) obj;
            e.add(new ModalActionSheetListItem(i, xubVar.c ? ModalActionSheetListItem.Appearance.Negative : ModalActionSheetListItem.Appearance.Default, xubVar.b.toString(), null, null, xubVar.a, null, false, false, 472));
            i = i2;
        }
        c0785a.b = e.g();
        c0785a.c = new uf1(12, izsVar, list);
        return c0785a;
    }
}
