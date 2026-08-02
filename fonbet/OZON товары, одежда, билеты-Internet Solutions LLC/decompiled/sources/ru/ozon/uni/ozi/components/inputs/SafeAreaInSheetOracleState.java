package ru.ozon.uni.ozi.components.inputs;

import Ae.w0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Z1.o;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import z0.InterfaceC10969b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/ozi/components/inputs/SafeAreaInSheetOracleState;", "", "<init>", "()V", "Lz0/b;", "requester$delegate", "LSc/j;", "getRequester", "()Lz0/b;", "requester", "LZ1/o;", "rect", "LZ1/o;", "getRect", "()LZ1/o;", "setRect", "(LZ1/o;)V", "LAe/w0;", "", "positionChangesFlow$delegate", "getPositionChangesFlow", "()LAe/w0;", "positionChangesFlow", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SafeAreaInSheetOracleState {

    /* renamed from: positionChangesFlow$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j positionChangesFlow;
    private o rect;

    /* renamed from: requester$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j requester;

    public SafeAreaInSheetOracleState() {
        n nVar = n.NONE;
        this.requester = k.a(nVar, SafeAreaInSheetOracleState$requester$2.INSTANCE);
        this.positionChangesFlow = k.a(nVar, SafeAreaInSheetOracleState$positionChangesFlow$2.INSTANCE);
    }

    @NotNull
    public final w0<Unit> getPositionChangesFlow() {
        return (w0) this.positionChangesFlow.getValue();
    }

    public final o getRect() {
        return this.rect;
    }

    @NotNull
    public final InterfaceC10969b getRequester() {
        return (InterfaceC10969b) this.requester.getValue();
    }

    public final void setRect(o oVar) {
        this.rect = oVar;
    }
}
