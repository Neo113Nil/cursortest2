package com.vk.voip.ui.accessibility;

import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.voip.ui.members.VoipDataProvider;
import io.reactivex.rxjava3.core.q;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import xsna.al;
import xsna.bl;
import xsna.bpn0;

/* compiled from: AccessibilityEventsAuthorsProviderImpl.kt */
/* loaded from: classes7.dex */
public final class a implements AccessibilityEvents.c {
    public final Lazy a;

    public a(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    @Override // com.vk.voip.ui.accessibility.AccessibilityEvents.c
    public final q<List<AccessibilityEvents.a>> a(Collection<String> collection) {
        int i = 0;
        return ((VoipDataProvider) this.a.getValue()).i(collection).U(new bl(new al(i, collection), i));
    }
}
