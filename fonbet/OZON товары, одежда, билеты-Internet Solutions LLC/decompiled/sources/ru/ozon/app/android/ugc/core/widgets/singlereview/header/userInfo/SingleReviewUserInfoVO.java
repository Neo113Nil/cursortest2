package ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo;

import Ak.C2436a;
import B3.p;
import G.g;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "avatarUrl", "Lru/ozon/uni/atoms/data/text/TextDTO;", "externalReview", "LWZ/t;", "tokenizedEvent", "tileReviewTokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getName", "getAvatarUrl", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getExternalReview", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getTileReviewTokenizedEvent", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewUserInfoVO implements c {
    private final String avatarUrl;
    private final TextDTO externalReview;
    private final long id;

    @NotNull
    private final String name;
    private final t tileReviewTokenizedEvent;
    private final t tokenizedEvent;

    public SingleReviewUserInfoVO(long j11, @NotNull String name, String str, TextDTO textDTO, t tVar, t tVar2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j11;
        this.name = name;
        this.avatarUrl = str;
        this.externalReview = textDTO;
        this.tokenizedEvent = tVar;
        this.tileReviewTokenizedEvent = tVar2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewUserInfoVO)) {
            return false;
        }
        SingleReviewUserInfoVO singleReviewUserInfoVO = (SingleReviewUserInfoVO) other;
        return this.id == singleReviewUserInfoVO.id && Intrinsics.d(this.name, singleReviewUserInfoVO.name) && Intrinsics.d(this.avatarUrl, singleReviewUserInfoVO.avatarUrl) && Intrinsics.d(this.externalReview, singleReviewUserInfoVO.externalReview) && Intrinsics.d(this.tokenizedEvent, singleReviewUserInfoVO.tokenizedEvent) && Intrinsics.d(this.tileReviewTokenizedEvent, singleReviewUserInfoVO.tileReviewTokenizedEvent);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final TextDTO getExternalReview() {
        return this.externalReview;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTileReviewTokenizedEvent() {
        return this.tileReviewTokenizedEvent;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.name);
        String str = this.avatarUrl;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        TextDTO textDTO = this.externalReview;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.tileReviewTokenizedEvent;
        return hashCode3 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.name;
        String str2 = this.avatarUrl;
        TextDTO textDTO = this.externalReview;
        t tVar = this.tokenizedEvent;
        t tVar2 = this.tileReviewTokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "SingleReviewUserInfoVO(id=", ", name=", str);
        c11.append(", avatarUrl=");
        c11.append(str2);
        c11.append(", externalReview=");
        c11.append(textDTO);
        p.d(c11, ", tokenizedEvent=", tVar, ", tileReviewTokenizedEvent=", tVar2);
        c11.append(")");
        return c11.toString();
    }
}
