package io.capawesome.capacitorjs.plugins.agesignals.classes.results;

import com.getcapacitor.JSObject;
import com.google.android.play.agesignals.AgeSignalsResult;
import io.capawesome.capacitorjs.plugins.agesignals.enums.UserStatus;
import io.capawesome.capacitorjs.plugins.agesignals.interfaces.Result;

/* loaded from: classes8.dex */
public class CheckAgeSignalsResult implements Result {
    private final Integer ageLower;
    private final Integer ageUpper;
    private final String installId;
    private final String mostRecentApprovalDate;
    private final UserStatus userStatus;

    public CheckAgeSignalsResult(AgeSignalsResult ageSignalsResult) {
        this.userStatus = mapUserStatus(ageSignalsResult.userStatus());
        this.ageLower = ageSignalsResult.ageLower();
        this.ageUpper = ageSignalsResult.ageUpper();
        this.mostRecentApprovalDate = ageSignalsResult.mostRecentApprovalDate() != null ? ageSignalsResult.mostRecentApprovalDate().toString() : null;
        this.installId = ageSignalsResult.installId();
    }

    @Override // io.capawesome.capacitorjs.plugins.agesignals.interfaces.Result
    public JSObject toJSObject() {
        JSObject jSObject = new JSObject();
        jSObject.put("userStatus", this.userStatus.name());
        Integer num = this.ageLower;
        if (num != null) {
            jSObject.put("ageLower", (Object) num);
        }
        Integer num2 = this.ageUpper;
        if (num2 != null) {
            jSObject.put("ageUpper", (Object) num2);
        }
        String str = this.mostRecentApprovalDate;
        if (str != null) {
            jSObject.put("mostRecentApprovalDate", str);
        }
        String str2 = this.installId;
        if (str2 != null) {
            jSObject.put("installId", str2);
        }
        return jSObject;
    }

    private UserStatus mapUserStatus(Integer num) {
        if (num == null) {
            return UserStatus.EMPTY;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return UserStatus.VERIFIED;
        }
        if (intValue == 1) {
            return UserStatus.SUPERVISED;
        }
        if (intValue == 2) {
            return UserStatus.SUPERVISED_APPROVAL_PENDING;
        }
        if (intValue == 3) {
            return UserStatus.SUPERVISED_APPROVAL_DENIED;
        }
        if (intValue == 4) {
            return UserStatus.UNKNOWN;
        }
        if (intValue == 5) {
            return UserStatus.DECLARED;
        }
        throw new IllegalArgumentException("Invalid UserStatus: " + num);
    }
}
