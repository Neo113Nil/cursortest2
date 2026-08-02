package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText;

import G.g;
import TY.a;
import Tg.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.data.ReviewStatusInfoDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b%\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/dateText/DateTextVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "timestamp", "dateFormat", "backgroundColor", "Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/data/ReviewStatusInfoDTO$DateTextDTO$PaddingsDTO;", "paddings", "LTg/b;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/data/ReviewStatusInfoDTO$DateTextDTO$PaddingsDTO;LTg/b;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getTimestamp", "getDateFormat", "getBackgroundColor", "Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/data/ReviewStatusInfoDTO$DateTextDTO$PaddingsDTO;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/data/ReviewStatusInfoDTO$DateTextDTO$PaddingsDTO;", "LTg/b;", "getAction", "()LTg/b;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DateTextVO implements c {
    private final b action;
    private final String backgroundColor;
    private final String dateFormat;
    private final long id;
    private final ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddings;

    @NotNull
    private final TextDTO text;

    @NotNull
    private final String timestamp;
    private final t tokenizedEvent;

    public DateTextVO(long j11, @NotNull TextDTO text, @NotNull String timestamp, String str, String str2, ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddingsDTO, b bVar, t tVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.id = j11;
        this.text = text;
        this.timestamp = timestamp;
        this.dateFormat = str;
        this.backgroundColor = str2;
        this.paddings = paddingsDTO;
        this.action = bVar;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateTextVO)) {
            return false;
        }
        DateTextVO dateTextVO = (DateTextVO) other;
        return this.id == dateTextVO.id && Intrinsics.d(this.text, dateTextVO.text) && Intrinsics.d(this.timestamp, dateTextVO.timestamp) && Intrinsics.d(this.dateFormat, dateTextVO.dateFormat) && Intrinsics.d(this.backgroundColor, dateTextVO.backgroundColor) && Intrinsics.d(this.paddings, dateTextVO.paddings) && Intrinsics.d(this.action, dateTextVO.action) && Intrinsics.d(this.tokenizedEvent, dateTextVO.tokenizedEvent);
    }

    public final b getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getDateFormat() {
        return this.dateFormat;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO getPaddings() {
        return this.paddings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    @NotNull
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Ns.b.a(this.text, Long.hashCode(this.id) * 31, 31), 31, this.timestamp);
        String str = this.dateFormat;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddingsDTO = this.paddings;
        int hashCode3 = (hashCode2 + (paddingsDTO == null ? 0 : paddingsDTO.hashCode())) * 31;
        b bVar = this.action;
        int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.text;
        String str = this.timestamp;
        String str2 = this.dateFormat;
        String str3 = this.backgroundColor;
        ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddingsDTO = this.paddings;
        b bVar = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("DateTextVO(id=", j11, ", text=", textDTO);
        Nh.a.h(b11, ", timestamp=", str, ", dateFormat=", str2);
        b11.append(", backgroundColor=");
        b11.append(str3);
        b11.append(", paddings=");
        b11.append(paddingsDTO);
        b11.append(", action=");
        b11.append(bVar);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
