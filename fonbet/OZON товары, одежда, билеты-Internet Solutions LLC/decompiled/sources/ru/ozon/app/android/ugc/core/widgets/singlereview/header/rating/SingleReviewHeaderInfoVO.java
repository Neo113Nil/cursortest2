package ru.ozon.app.android.ugc.core.widgets.singlereview.header.rating;

import Bi.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "rating", "", "date", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/Float;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Float;", "getRating", "()Ljava/lang/Float;", "Ljava/lang/String;", "getDate", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewHeaderInfoVO implements c {
    private final String date;
    private final long id;
    private final Float rating;
    private final t tokenizedEvent;

    public SingleReviewHeaderInfoVO(long j11, Float f7, String str, t tVar) {
        this.id = j11;
        this.rating = f7;
        this.date = str;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewHeaderInfoVO)) {
            return false;
        }
        SingleReviewHeaderInfoVO singleReviewHeaderInfoVO = (SingleReviewHeaderInfoVO) other;
        return this.id == singleReviewHeaderInfoVO.id && Intrinsics.d(this.rating, singleReviewHeaderInfoVO.rating) && Intrinsics.d(this.date, singleReviewHeaderInfoVO.date) && Intrinsics.d(this.tokenizedEvent, singleReviewHeaderInfoVO.tokenizedEvent);
    }

    public final String getDate() {
        return this.date;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Float getRating() {
        return this.rating;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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
        Float f7 = this.rating;
        int hashCode2 = (hashCode + (f7 == null ? 0 : f7.hashCode())) * 31;
        String str = this.date;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Float f7 = this.rating;
        String str = this.date;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("SingleReviewHeaderInfoVO(id=");
        sb2.append(j11);
        sb2.append(", rating=");
        sb2.append(f7);
        a.f(sb2, ", date=", str, ", tokenizedEvent=", tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
