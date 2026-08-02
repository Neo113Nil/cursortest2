package io.branch.referral;

/* loaded from: classes9.dex */
public class BranchError {
    public static final int ERR_API_LVL_14_NEEDED = -108;
    public static final int ERR_BRANCH_ALREADY_INITIALIZED = -118;
    public static final int ERR_BRANCH_DUPLICATE_REFERRAL_CODE = -106;
    public static final int ERR_BRANCH_DUPLICATE_URL = -105;
    public static final int ERR_BRANCH_INIT_FAILED = -104;
    public static final int ERR_BRANCH_INVALID_REQUEST = -116;
    public static final int ERR_BRANCH_KEY_INVALID = -114;
    public static final int ERR_BRANCH_NOT_INSTANTIATED = -109;
    public static final int ERR_BRANCH_NO_CONNECTIVITY = -113;
    public static final int ERR_BRANCH_NO_SHARE_OPTION = -110;
    public static final int ERR_BRANCH_REDEEM_REWARD = -107;
    public static final int ERR_BRANCH_REQ_TIMED_OUT = -111;
    public static final int ERR_BRANCH_RESOURCE_CONFLICT = -115;
    public static final int ERR_BRANCH_TRACKING_DISABLED = -117;
    public static final int ERR_BRANCH_UNABLE_TO_REACH_SERVERS = -112;
    public static final int ERR_INVALID_REFERRAL_CODE = -103;
    public static final int ERR_NO_INTERNET_PERMISSION = -102;
    public static final int ERR_NO_SESSION = -101;
    int errorCode_ = -113;
    String errorMessage_;

    public String getMessage() {
        return this.errorMessage_;
    }

    public int getErrorCode() {
        return this.errorCode_;
    }

    public String toString() {
        return getMessage();
    }

    public BranchError(String str, int i) {
        this.errorMessage_ = "";
        this.errorMessage_ = str + initErrorCodeAndGetLocalisedMessage(i);
    }

    private String initErrorCodeAndGetLocalisedMessage(int i) {
        if (i == -113) {
            this.errorCode_ = -113;
            return " Branch API Error: poor network connectivity. Please try again later.";
        }
        if (i == -114) {
            this.errorCode_ = -114;
            return " Branch API Error: Please enter your branch_key in your project's manifest file first.";
        }
        if (i == -104) {
            this.errorCode_ = -104;
            return " Did you forget to call init? Make sure you init the session before making Branch calls.";
        }
        if (i == -101) {
            this.errorCode_ = -101;
            return " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
        }
        if (i == -102) {
            this.errorCode_ = -102;
            return " Please add 'android.permission.INTERNET' in your applications manifest file.";
        }
        if (i == -105) {
            this.errorCode_ = -105;
            return " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
        }
        if (i == -106) {
            this.errorCode_ = -106;
            return " That Branch referral code is already in use.";
        }
        if (i == -107) {
            this.errorCode_ = -107;
            return " Unable to redeem rewards. Please make sure you have credits available to redeem.";
        }
        if (i == -108) {
            this.errorCode_ = -108;
            return "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
        }
        if (i == -109) {
            this.errorCode_ = -109;
            return "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
        }
        if (i == -110) {
            this.errorCode_ = -110;
            return " Unable create share options. Couldn't find applications on device to share the link.";
        }
        if (i == -111) {
            this.errorCode_ = -111;
            return " Request to Branch server timed out. Please check your internet connectivity";
        }
        if (i == -117) {
            this.errorCode_ = -117;
            return " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
        }
        if (i == -118) {
            this.errorCode_ = -118;
            return " Session initialization already happened. To force a new session, set intent extra, \"branch_force_new_session\", to true.";
        }
        if (i >= 500 || i == -112) {
            this.errorCode_ = -112;
            return " Unable to reach the Branch servers, please try again shortly.";
        }
        if (i == 409 || i == -115) {
            this.errorCode_ = -115;
            return " A resource with this identifier already exists.";
        }
        if (i >= 400 || i == -116) {
            this.errorCode_ = ERR_BRANCH_INVALID_REQUEST;
            return " The request was invalid.";
        }
        this.errorCode_ = -113;
        return " Check network connectivity and that you properly initialized.";
    }
}
