package com.vk.voip.ui.settings.participants_view;

import androidx.recyclerview.widget.m;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import xsna.epx;
import xsna.zq70;

/* compiled from: CallParticipantsAdapterDiffCallback.kt */
/* loaded from: classes7.dex */
public final class b extends m.e<CallSettingsItem> {
    public static boolean a(CallSettingsItem callSettingsItem, CallSettingsItem callSettingsItem2) {
        if ((callSettingsItem instanceof CallSettingsItem.h) && (callSettingsItem2 instanceof CallSettingsItem.h)) {
            return true;
        }
        if ((callSettingsItem instanceof CallSettingsItem.e) && (callSettingsItem2 instanceof CallSettingsItem.e)) {
            return true;
        }
        if ((callSettingsItem instanceof CallSettingsItem.a) && (callSettingsItem2 instanceof CallSettingsItem.a)) {
            return true;
        }
        if (((callSettingsItem instanceof CallSettingsItem.CallParticipant) && (callSettingsItem2 instanceof CallSettingsItem.CallParticipant) && epx.f(((CallSettingsItem.CallParticipant) callSettingsItem).a, ((CallSettingsItem.CallParticipant) callSettingsItem2).a)) || ((callSettingsItem instanceof CallSettingsItem.i) && (callSettingsItem2 instanceof CallSettingsItem.i))) {
            return true;
        }
        if ((callSettingsItem instanceof CallSettingsItem.g) && (callSettingsItem2 instanceof CallSettingsItem.g)) {
            return true;
        }
        if ((callSettingsItem instanceof CallSettingsItem.d) && (callSettingsItem2 instanceof CallSettingsItem.d)) {
            return true;
        }
        if ((callSettingsItem instanceof CallSettingsItem.TitleHeader) && (callSettingsItem2 instanceof CallSettingsItem.TitleHeader)) {
            return true;
        }
        if (!(callSettingsItem instanceof CallSettingsItem.f) || !(callSettingsItem2 instanceof CallSettingsItem.f) || !epx.f(((CallSettingsItem.f) callSettingsItem).a, ((CallSettingsItem.f) callSettingsItem2).a)) {
            if ((callSettingsItem instanceof CallSettingsItem.c) && (callSettingsItem2 instanceof CallSettingsItem.c)) {
                return true;
            }
            return (callSettingsItem instanceof CallSettingsItem.FillSpace) && (callSettingsItem2 instanceof CallSettingsItem.FillSpace);
        }
        return true;
    }

    public static zq70 b(CallSettingsItem callSettingsItem, CallSettingsItem callSettingsItem2) {
        if (!(callSettingsItem instanceof CallSettingsItem.CallParticipant) || !(callSettingsItem2 instanceof CallSettingsItem.CallParticipant)) {
            return null;
        }
        CallSettingsItem.CallParticipant callParticipant = (CallSettingsItem.CallParticipant) callSettingsItem;
        CallSettingsItem.CallParticipant callParticipant2 = (CallSettingsItem.CallParticipant) callSettingsItem2;
        if (epx.f(callParticipant.b, callParticipant2.b) && epx.f(callParticipant.c, callParticipant2.c) && epx.f(callParticipant.d, callParticipant2.d)) {
            epx.f(callParticipant.f, callParticipant2.f);
        }
        return new zq70();
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(CallSettingsItem callSettingsItem, CallSettingsItem callSettingsItem2) {
        return callSettingsItem.equals(callSettingsItem2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(CallSettingsItem callSettingsItem, CallSettingsItem callSettingsItem2) {
        return a(callSettingsItem, callSettingsItem2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ Object getChangePayload(CallSettingsItem callSettingsItem, CallSettingsItem callSettingsItem2) {
        return b(callSettingsItem, callSettingsItem2);
    }
}
