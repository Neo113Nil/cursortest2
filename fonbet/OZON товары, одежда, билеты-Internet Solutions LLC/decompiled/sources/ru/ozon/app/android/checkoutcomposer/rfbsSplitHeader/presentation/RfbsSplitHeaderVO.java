package ru.ozon.app.android.checkoutcomposer.rfbsSplitHeader.presentation;

import B0.A0;
import B90.C2619v;
import Bl.C2639a;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplitHeader/presentation/RfbsSplitHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", CommentV3DTO.HEADER_FIELD_NAME, "", "stickyGroupTag", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getStickyGroupTag-YLNZ-8Q", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RfbsSplitHeaderVO implements c {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final TextAtom header;
    private final long id;
    private final String stickyGroupTag;

    public /* synthetic */ RfbsSplitHeaderVO(long j11, TextAtom textAtom, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, textAtom, str);
    }

    public boolean equals(Object other) {
        boolean d11;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RfbsSplitHeaderVO)) {
            return false;
        }
        RfbsSplitHeaderVO rfbsSplitHeaderVO = (RfbsSplitHeaderVO) other;
        if (this.id != rfbsSplitHeaderVO.id || !Intrinsics.d(this.header, rfbsSplitHeaderVO.header)) {
            return false;
        }
        String str = this.stickyGroupTag;
        String str2 = rfbsSplitHeaderVO.stickyGroupTag;
        if (str == null) {
            if (str2 == null) {
                d11 = true;
            }
            d11 = false;
        } else {
            if (str2 != null) {
                d11 = Intrinsics.d(str, str2);
            }
            d11 = false;
        }
        return d11;
    }

    @NotNull
    public final TextAtom getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    /* renamed from: getStickyGroupTag-YLNZ-8Q, reason: not valid java name and from getter */
    public final String getStickyGroupTag() {
        return this.stickyGroupTag;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.header);
        String str = this.stickyGroupTag;
        return b11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.header;
        String str = this.stickyGroupTag;
        return C6594f.a(", stickyGroupTag=", str == null ? "null" : A0.b("StickyGroupTag(tag=", str, ")"), ")", C2639a.c("RfbsSplitHeaderVO(id=", j11, ", header=", textAtom));
    }

    private RfbsSplitHeaderVO(long j11, TextAtom header, String str) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.id = j11;
        this.header = header;
        this.stickyGroupTag = str;
    }
}
