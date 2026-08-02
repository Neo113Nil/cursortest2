package com.vk.stat.sak.scheme;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$TypeErrorShownItem implements SchemeStatSak$TypeAction.b {

    @pmi0("actual_error_description")
    private final String actualErrorDescription;

    @pmi0("actual_view")
    private final SchemeStatSak$ErrorView actualView;

    @pmi0("backend_method")
    private final String backendMethod;

    @pmi0("backend_section")
    private final String backendSection;

    @pmi0("error")
    private final String error;

    @pmi0("error_code")
    private final String errorCode;

    @pmi0("error_description")
    private final String errorDescription;

    @pmi0("error_subcode")
    private final String errorSubcode;

    @pmi0("unauth_id")
    private final Integer unauthId;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
    private final SchemeStatSak$ErrorView view;

    public SchemeStatSak$TypeErrorShownItem(String str, SchemeStatSak$ErrorView schemeStatSak$ErrorView, String str2, String str3, SchemeStatSak$ErrorView schemeStatSak$ErrorView2, String str4, String str5, String str6, String str7, Integer num) {
        this.backendSection = str;
        this.actualView = schemeStatSak$ErrorView;
        this.error = str2;
        this.backendMethod = str3;
        this.view = schemeStatSak$ErrorView2;
        this.errorDescription = str4;
        this.actualErrorDescription = str5;
        this.errorCode = str6;
        this.errorSubcode = str7;
        this.unauthId = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStatSak$TypeErrorShownItem)) {
            return false;
        }
        SchemeStatSak$TypeErrorShownItem schemeStatSak$TypeErrorShownItem = (SchemeStatSak$TypeErrorShownItem) obj;
        return epx.f(this.backendSection, schemeStatSak$TypeErrorShownItem.backendSection) && this.actualView == schemeStatSak$TypeErrorShownItem.actualView && epx.f(this.error, schemeStatSak$TypeErrorShownItem.error) && epx.f(this.backendMethod, schemeStatSak$TypeErrorShownItem.backendMethod) && this.view == schemeStatSak$TypeErrorShownItem.view && epx.f(this.errorDescription, schemeStatSak$TypeErrorShownItem.errorDescription) && epx.f(this.actualErrorDescription, schemeStatSak$TypeErrorShownItem.actualErrorDescription) && epx.f(this.errorCode, schemeStatSak$TypeErrorShownItem.errorCode) && epx.f(this.errorSubcode, schemeStatSak$TypeErrorShownItem.errorSubcode) && epx.f(this.unauthId, schemeStatSak$TypeErrorShownItem.unauthId);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a((this.actualView.hashCode() + (this.backendSection.hashCode() * 31)) * 31, 31, this.error), 31, this.backendMethod);
        SchemeStatSak$ErrorView schemeStatSak$ErrorView = this.view;
        int hashCode = (a + (schemeStatSak$ErrorView == null ? 0 : schemeStatSak$ErrorView.hashCode())) * 31;
        String str = this.errorDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actualErrorDescription;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorCode;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorSubcode;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.unauthId;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeErrorShownItem(backendSection=");
        sb.append(this.backendSection);
        sb.append(", actualView=");
        sb.append(this.actualView);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", backendMethod=");
        sb.append(this.backendMethod);
        sb.append(", view=");
        sb.append(this.view);
        sb.append(", errorDescription=");
        sb.append(this.errorDescription);
        sb.append(", actualErrorDescription=");
        sb.append(this.actualErrorDescription);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorSubcode=");
        sb.append(this.errorSubcode);
        sb.append(", unauthId=");
        return uqi.b(sb, this.unauthId, ')');
    }

    public /* synthetic */ SchemeStatSak$TypeErrorShownItem(String str, SchemeStatSak$ErrorView schemeStatSak$ErrorView, String str2, String str3, SchemeStatSak$ErrorView schemeStatSak$ErrorView2, String str4, String str5, String str6, String str7, Integer num, int i, zcl zclVar) {
        this(str, schemeStatSak$ErrorView, str2, str3, (i & 16) != 0 ? null : schemeStatSak$ErrorView2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : num);
    }
}
