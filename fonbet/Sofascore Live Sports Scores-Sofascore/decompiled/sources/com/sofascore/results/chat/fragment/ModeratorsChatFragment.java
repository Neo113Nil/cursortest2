package com.sofascore.results.chat.fragment;

import com.sofascore.results.R;
import defpackage.dr2;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/chat/fragment/ModeratorsChatFragment;", "Lcom/sofascore/results/chat/fragment/AbstractChatFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ModeratorsChatFragment extends Hilt_ModeratorsChatFragment {
    public final dr2 R = new dr2(R.string.chat_empty_view, 3194, "lastMessageModerators", true);

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment
    /* renamed from: E, reason: from getter */
    public final dr2 getR() {
        return this.R;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "ModeratorsTab";
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment
    public final void N() {
    }
}
