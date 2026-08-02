package ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation;

import Ns.b;
import TY.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "timerText", SelectionItemFormDTO.TITLE_FIELD_NAME, "LWZ/t;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTimerText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "LWZ/t;", "getViewEvent", "()LWZ/t;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ModalCheckoutTimeLimitVO implements c {
    private final long id;
    private final TextDTO timerText;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    public ModalCheckoutTimeLimitVO(long j11, TextDTO textDTO, @NotNull TextDTO title, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.timerText = textDTO;
        this.title = title;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalCheckoutTimeLimitVO)) {
            return false;
        }
        ModalCheckoutTimeLimitVO modalCheckoutTimeLimitVO = (ModalCheckoutTimeLimitVO) other;
        return this.id == modalCheckoutTimeLimitVO.id && Intrinsics.d(this.timerText, modalCheckoutTimeLimitVO.timerText) && Intrinsics.d(this.title, modalCheckoutTimeLimitVO.title) && Intrinsics.d(this.viewEvent, modalCheckoutTimeLimitVO.viewEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getTimerText() {
        return this.timerText;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.timerText;
        int a11 = b.a(this.title, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        t tVar = this.viewEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.timerText;
        TextDTO textDTO2 = this.title;
        t tVar = this.viewEvent;
        StringBuilder b11 = a.b("ModalCheckoutTimeLimitVO(id=", j11, ", timerText=", textDTO);
        b11.append(", title=");
        b11.append(textDTO2);
        b11.append(", viewEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
