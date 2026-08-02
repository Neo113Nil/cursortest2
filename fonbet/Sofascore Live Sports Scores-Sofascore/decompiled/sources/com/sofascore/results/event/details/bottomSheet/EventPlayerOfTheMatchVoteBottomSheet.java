package com.sofascore.results.event.details.bottomSheet;

import android.os.Bundle;
import com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog;
import com.sofascore.results.event.details.bottomSheet.EventPlayerOfTheMatchVoteBottomSheet;
import defpackage.joa;
import defpackage.l56;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/event/details/bottomSheet/EventPlayerOfTheMatchVoteBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "", "localVotedPlayerId", "Lmte;", "playerToConfirm", "Ljs8;", "timer", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventPlayerOfTheMatchVoteBottomSheet extends ComposeModalBottomSheetDialog {
    public final joa A;
    public final joa B;
    public final joa x;
    public final joa y;
    public final joa z;

    public EventPlayerOfTheMatchVoteBottomSheet() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: k56
            public final /* synthetic */ EventPlayerOfTheMatchVoteBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EventPlayerOfTheMatchVoteBottomSheet eventPlayerOfTheMatchVoteBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        return Integer.valueOf(eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getInt("EVENT_ID"));
                    case 1:
                        return Long.valueOf(eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getLong("EVENT_TIMESTAMP"));
                    case 2:
                        int i3 = eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getInt("VOTED_PLAYER_ID", -1);
                        Integer valueOf = Integer.valueOf(i3);
                        if (i3 != -1) {
                            return valueOf;
                        }
                        return null;
                    case 3:
                        Bundle requireArguments = eventPlayerOfTheMatchVoteBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYERS", ArrayList.class);
                        if (M != null) {
                            return l6g.W((Iterable) M);
                        }
                        a70.p("Serializable PLAYERS not found");
                        return null;
                    default:
                        long j = eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getLong("VOTE_END_TIMESTAMP", -1L);
                        Long valueOf2 = Long.valueOf(j);
                        if (j != -1) {
                            return valueOf2;
                        }
                        return null;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.x = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.y = ypa.a(ysaVar, new Function0(this) { // from class: k56
            public final /* synthetic */ EventPlayerOfTheMatchVoteBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EventPlayerOfTheMatchVoteBottomSheet eventPlayerOfTheMatchVoteBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        return Integer.valueOf(eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getInt("EVENT_ID"));
                    case 1:
                        return Long.valueOf(eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getLong("EVENT_TIMESTAMP"));
                    case 2:
                        int i3 = eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getInt("VOTED_PLAYER_ID", -1);
                        Integer valueOf = Integer.valueOf(i3);
                        if (i3 != -1) {
                            return valueOf;
                        }
                        return null;
                    case 3:
                        Bundle requireArguments = eventPlayerOfTheMatchVoteBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYERS", ArrayList.class);
                        if (M != null) {
                            return l6g.W((Iterable) M);
                        }
                        a70.p("Serializable PLAYERS not found");
                        return null;
                    default:
                        long j = eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getLong("VOTE_END_TIMESTAMP", -1L);
                        Long valueOf2 = Long.valueOf(j);
                        if (j != -1) {
                            return valueOf2;
                        }
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.z = ypa.a(ysaVar, new Function0(this) { // from class: k56
            public final /* synthetic */ EventPlayerOfTheMatchVoteBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EventPlayerOfTheMatchVoteBottomSheet eventPlayerOfTheMatchVoteBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        return Integer.valueOf(eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getInt("EVENT_ID"));
                    case 1:
                        return Long.valueOf(eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getLong("EVENT_TIMESTAMP"));
                    case 2:
                        int i32 = eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getInt("VOTED_PLAYER_ID", -1);
                        Integer valueOf = Integer.valueOf(i32);
                        if (i32 != -1) {
                            return valueOf;
                        }
                        return null;
                    case 3:
                        Bundle requireArguments = eventPlayerOfTheMatchVoteBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYERS", ArrayList.class);
                        if (M != null) {
                            return l6g.W((Iterable) M);
                        }
                        a70.p("Serializable PLAYERS not found");
                        return null;
                    default:
                        long j = eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getLong("VOTE_END_TIMESTAMP", -1L);
                        Long valueOf2 = Long.valueOf(j);
                        if (j != -1) {
                            return valueOf2;
                        }
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.A = ypa.a(ysaVar, new Function0(this) { // from class: k56
            public final /* synthetic */ EventPlayerOfTheMatchVoteBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                EventPlayerOfTheMatchVoteBottomSheet eventPlayerOfTheMatchVoteBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        return Integer.valueOf(eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getInt("EVENT_ID"));
                    case 1:
                        return Long.valueOf(eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getLong("EVENT_TIMESTAMP"));
                    case 2:
                        int i32 = eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getInt("VOTED_PLAYER_ID", -1);
                        Integer valueOf = Integer.valueOf(i32);
                        if (i32 != -1) {
                            return valueOf;
                        }
                        return null;
                    case 3:
                        Bundle requireArguments = eventPlayerOfTheMatchVoteBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYERS", ArrayList.class);
                        if (M != null) {
                            return l6g.W((Iterable) M);
                        }
                        a70.p("Serializable PLAYERS not found");
                        return null;
                    default:
                        long j = eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getLong("VOTE_END_TIMESTAMP", -1L);
                        Long valueOf2 = Long.valueOf(j);
                        if (j != -1) {
                            return valueOf2;
                        }
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.B = ypa.a(ysaVar, new Function0(this) { // from class: k56
            public final /* synthetic */ EventPlayerOfTheMatchVoteBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                EventPlayerOfTheMatchVoteBottomSheet eventPlayerOfTheMatchVoteBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        return Integer.valueOf(eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getInt("EVENT_ID"));
                    case 1:
                        return Long.valueOf(eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getLong("EVENT_TIMESTAMP"));
                    case 2:
                        int i32 = eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getInt("VOTED_PLAYER_ID", -1);
                        Integer valueOf = Integer.valueOf(i32);
                        if (i32 != -1) {
                            return valueOf;
                        }
                        return null;
                    case 3:
                        Bundle requireArguments = eventPlayerOfTheMatchVoteBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYERS", ArrayList.class);
                        if (M != null) {
                            return l6g.W((Iterable) M);
                        }
                        a70.p("Serializable PLAYERS not found");
                        return null;
                    default:
                        long j = eventPlayerOfTheMatchVoteBottomSheet.requireArguments().getLong("VOTE_END_TIMESTAMP", -1L);
                        Long valueOf2 = Long.valueOf(j);
                        if (j != -1) {
                            return valueOf2;
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getC() {
        return new tc3(-748717999, new l56(this, 1), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    public final Function2 I() {
        return new tc3(459875319, new l56(this, 0), true);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "POTMVoteModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x */
    public final boolean getW() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
