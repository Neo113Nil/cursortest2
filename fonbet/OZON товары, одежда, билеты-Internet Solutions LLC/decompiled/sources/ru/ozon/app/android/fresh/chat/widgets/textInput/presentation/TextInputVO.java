package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation;

import Ak.C2436a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/TextInputVO;", "Ll20/c;", "", "id", "", HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/uni/atoms/data/AtomActionDTO;", "sendAction", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getPlaceholder", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSendAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TextInputVO implements c {
    private final long id;
    private final String placeholder;
    private final AtomActionDTO sendAction;
    private final t tokenizedEvent;

    public TextInputVO(long j11, String str, AtomActionDTO atomActionDTO, t tVar) {
        this.id = j11;
        this.placeholder = str;
        this.sendAction = atomActionDTO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputVO)) {
            return false;
        }
        TextInputVO textInputVO = (TextInputVO) other;
        return this.id == textInputVO.id && Intrinsics.d(this.placeholder, textInputVO.placeholder) && Intrinsics.d(this.sendAction, textInputVO.sendAction) && Intrinsics.d(this.tokenizedEvent, textInputVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final AtomActionDTO getSendAction() {
        return this.sendAction;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.placeholder;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.sendAction;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.placeholder;
        AtomActionDTO atomActionDTO = this.sendAction;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "TextInputVO(id=", ", placeholder=", str);
        c11.append(", sendAction=");
        c11.append(atomActionDTO);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(")");
        return c11.toString();
    }
}
