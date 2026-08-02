package com.vk.sdk.api.prettyCards.dto;

import com.vk.sdk.api.base.dto.BaseRequestParamDto;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;

/* compiled from: PrettyCardsPrettyCardOrErrorDto.kt */
/* loaded from: classes5.dex */
public final class PrettyCardsPrettyCardOrErrorDto {

    @pmi0("error_code")
    private final int errorCode;

    @pmi0(SharedKt.PARAM_ERROR_MSG)
    private final String errorMsg;

    @pmi0("error_subcode")
    private final Integer errorSubcode;

    @pmi0("error_text")
    private final String errorText;

    @pmi0("request_params")
    private final List<BaseRequestParamDto> requestParams;

    public PrettyCardsPrettyCardOrErrorDto(int i, Integer num, String str, String str2, List<BaseRequestParamDto> list) {
        this.errorCode = i;
        this.errorSubcode = num;
        this.errorMsg = str;
        this.errorText = str2;
        this.requestParams = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrettyCardsPrettyCardOrErrorDto)) {
            return false;
        }
        PrettyCardsPrettyCardOrErrorDto prettyCardsPrettyCardOrErrorDto = (PrettyCardsPrettyCardOrErrorDto) obj;
        return this.errorCode == prettyCardsPrettyCardOrErrorDto.errorCode && epx.f(this.errorSubcode, prettyCardsPrettyCardOrErrorDto.errorSubcode) && epx.f(this.errorMsg, prettyCardsPrettyCardOrErrorDto.errorMsg) && epx.f(this.errorText, prettyCardsPrettyCardOrErrorDto.errorText) && epx.f(this.requestParams, prettyCardsPrettyCardOrErrorDto.requestParams);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.errorCode) * 31;
        Integer num = this.errorSubcode;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorMsg;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorText;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseRequestParamDto> list = this.requestParams;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i = this.errorCode;
        Integer num = this.errorSubcode;
        String str = this.errorMsg;
        String str2 = this.errorText;
        List<BaseRequestParamDto> list = this.requestParams;
        StringBuilder sb = new StringBuilder("PrettyCardsPrettyCardOrErrorDto(errorCode=");
        sb.append(i);
        sb.append(", errorSubcode=");
        sb.append(num);
        sb.append(", errorMsg=");
        n6j.b(sb, str, ", errorText=", str2, ", requestParams=");
        return vp.b(")", sb, list);
    }

    public /* synthetic */ PrettyCardsPrettyCardOrErrorDto(int i, Integer num, String str, String str2, List list, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : list);
    }
}
