package com.mbridge.msdk.video.dynview.moffer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.dynview.widget.ObservableScrollView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import defpackage.fc6;
import defpackage.lnb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MOfferModel implements NoProGuard {
    private static final String MOF_LOAD_RESULT_CODE_OFFER_LESS_THAN_5 = "12930014";
    private static final String MOF_LOAD_RESULT_FAILED = "2";
    private static final String MOF_LOAD_RESULT_SUCCESS = "1";
    private static final String TAG = "MOfferModel";
    private int admf;
    private int admftm;
    private List<Integer> cacheImpressionReportList;
    private List<Integer> cacheOnlyImpressionReportList;
    private boolean isShowMoreOffer;
    private CampaignUnit mCampaignUnit;
    private Context mContext;
    private LinearLayout mLinearLayout;
    private CampaignEx mMainOfferCampaignEx;
    private com.mbridge.msdk.video.dynview.listener.g mMoreOfferLayoutListener;
    private com.mbridge.msdk.video.module.listener.a mNotifyListener;
    private ObservableScrollView mObservableScrollView;
    private com.mbridge.msdk.foundation.same.net.wrapper.e mParam;
    private String mRid;
    private String mUnitId;
    private MBridgeRelativeLayout viewMofferLayout;
    private final String VALUE_MOF_TYPE = "1";
    private final String VALUE_H5_TYPE = "1";
    private final String VALUE_MOF = "1";
    private final String VALUE_COUNTRY_CODE = "CN";
    private final String VALUE_MOF_VER = "1";
    private final String VALUE_OFF_SET = "0";
    private final String VALUE_CATEGORY = "0";
    private final String VALUE_ONLY_IMPRESSION = "1";
    private final String VALUE_PING_MODE = "1";
    private final String VALUE_HTTP_REQ = "2";
    private final String VALUE_AD_NUM = "20";
    private final String VALUE_TNUM = "20";
    private final String VALUE_API_VERSION = "2.3";
    private final String VALUE_DEFAULT_VIDEO_TEMP_ID = "404";
    private final String K = CampaignEx.JSON_KEY_AD_K;
    private final String MOF_TEST_UID = "mof_testuid";
    private final String MCC = "mcc";
    private final String MOF_UID = "mof_uid";
    private final String MNC = "mnc";
    private final String RV_TID = "rv_tid";
    private final String EC_ID = "ecid";
    private final String TP_LGP = "tplgp";
    private final String V_FMD5 = "v_fmd5";
    private final String I_FMD5 = "i_fmd5";
    private final String APP_ID = MBridgeConstans.APP_ID;
    private final String SIGN = "sign";
    private final String PARENT_UNIT = "parent_unit";
    private final String E = "e";
    private final String MOF_TYPE = "mof_type";
    private final String H5_TYPE = "h5_type";
    private final String MOF = "mof";
    private final String COUNTRY_CODE = "country_code";
    private final String MOF_VER = "mof_ver";
    private final String CRT_CID = "crt_cid";
    private final String CRT_RID = "crt_rid";
    private final String H5_T = "h5_t";
    private final String MOF_T = "mof_t";
    private final String MOF_DATA = "mof_data";
    private final String OFFER_ID = "offer_id";
    private final String OFF_SET = "offset";
    private final String CATEGORY = "category";
    private final String ONLY_IMPRESSION = "only_impression";
    private final String PING_MODE = "ping_mode";
    private final String HTTP_REQ = "http_req";
    private final String AD_NUM = "ad_num";
    private final String TNUM = "tnum";
    private final String API_VERSION = "api_version";
    private final String MOF_DOMAIN = "mof_domain";
    private final String PARENT_ID = "parent_id";
    private final String MOF_PARENT_ID = "mof_parent_id";
    private final String MOF_CALLBACK_DATE = "mcd";
    private final String UC_PARENT_UNIT = "uc_parent_unit";
    private final String DEFAULT_PATH_V3 = "/openapi/ad/v3";
    private final String PARENT_EXCHANGE = "parent_exchange";
    private final String PARENT_AD_TYPE = "parent_ad_type";
    private final String PARENT_TEMPLATE_ID = "parent_template_id";
    private final String ONE_ID = "oneId";
    private final String DY_VIEW = "dy_view";
    private final String MORE_OFFER_DEFAULT_UNIT_ID = "117361";
    private final String MORE_OFFER_DEFAULT_APP_ID = "92762";
    private final String MORE_OFFER_DEFAULT_APP_KEY = "936dcbdd57fe235fd7cf61c2e93da3c4";
    private final String MORE_OFFER_LOAD_SUCCESS = "more offer load success";
    private final String MORE_OFFER_LOAD_FAILED = "more offer load failed";
    private final String MORE_OFFER_SHOW = "more offer show";
    private final String MORE_OFFER_CLICK = "more offer click";
    private final String MORE_OFFER_SHOW_FAILED = "more offer show fail";
    private final String UNIT_ID = MBridgeConstans.PROPERTIES_UNIT_ID;
    private final String R_ID = "r_id";
    private final int DO_ACTION_IMPRESSION = 0;
    private final int DO_ACTION_ONLY_IMPRESSION = 1;
    private volatile boolean hasReportMoreOfferLoad = false;
    private volatile boolean hasReportMoreOfferShow = false;
    private int bitmapSuccessCount = 0;
    private List<Integer> mImpressionId = new ArrayList();
    private int mControlShowSize = 0;
    private boolean isOnlyImpShow = false;
    private boolean mHasReportMofScenes = false;
    private boolean mIsRetry = false;
    private int mFromType = 0;
    private OnItemExposeListener onItemExposeListener = new a();
    private com.mbridge.msdk.video.dynview.moffer.c mMoreOfferShowCallBack = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements OnItemExposeListener {
        public a() {
        }

        @Override // com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener
        public void onItemViewFirstVisible() {
            if (MOfferModel.this.viewMofferLayout == null || !MOfferModel.this.isOnlyImpShow) {
                return;
            }
            int visibility = MOfferModel.this.viewMofferLayout.getVisibility();
            MOfferModel mOfferModel = MOfferModel.this;
            if (visibility == 0) {
                try {
                    com.mbridge.msdk.video.dynview.request.a.a(mOfferModel.mCampaignUnit, 0, 1, "117361");
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            if (mOfferModel.cacheOnlyImpressionReportList == null) {
                MOfferModel.this.cacheOnlyImpressionReportList = new ArrayList();
            }
            MOfferModel.this.cacheOnlyImpressionReportList.add(0);
        }

        @Override // com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener
        public void onItemViewVisible(boolean z, int i) {
            if (MOfferModel.this.viewMofferLayout == null) {
                return;
            }
            int visibility = MOfferModel.this.viewMofferLayout.getVisibility();
            MOfferModel mOfferModel = MOfferModel.this;
            if (visibility != 0) {
                if (mOfferModel.cacheImpressionReportList == null) {
                    MOfferModel.this.cacheImpressionReportList = new ArrayList();
                }
                if (MOfferModel.this.cacheImpressionReportList.contains(Integer.valueOf(i))) {
                    return;
                }
                MOfferModel.this.cacheImpressionReportList.add(Integer.valueOf(i));
                return;
            }
            if (!mOfferModel.hasReportMoreOfferShow) {
                com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), "more offer show", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                MOfferModel.this.hasReportMoreOfferShow = true;
            }
            try {
                com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mCampaignUnit, i, 0, "117361");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements com.mbridge.msdk.video.dynview.moffer.c {
        public b() {
        }

        @Override // com.mbridge.msdk.video.dynview.moffer.c
        public void a(List<View> list) {
            TextView textView;
            if (MOfferModel.this.viewMofferLayout == null || (textView = (TextView) MOfferModel.this.viewMofferLayout.findViewById(MOfferModel.this.findID("mbridge_reward_end_card_like_tv"))) == null) {
                return;
            }
            textView.setVisibility(0);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d implements com.mbridge.msdk.video.dynview.moffer.b {
        public d() {
        }

        @Override // com.mbridge.msdk.video.dynview.moffer.b
        public void a() {
            try {
                if (MOfferModel.this.cacheImpressionReportList != null) {
                    for (int i = 0; i < MOfferModel.this.cacheImpressionReportList.size(); i++) {
                        if (!MOfferModel.this.hasReportMoreOfferShow) {
                            com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, MOfferModel.this.mContext, "more offer show", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                            MOfferModel.this.hasReportMoreOfferShow = true;
                        }
                        com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mCampaignUnit, ((Integer) MOfferModel.this.cacheImpressionReportList.get(i)).intValue(), 0, "117361");
                    }
                }
                if (!MOfferModel.this.isOnlyImpShow && MOfferModel.this.cacheOnlyImpressionReportList != null) {
                    for (int i2 = 0; i2 < MOfferModel.this.cacheOnlyImpressionReportList.size(); i2++) {
                        com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mCampaignUnit, ((Integer) MOfferModel.this.cacheOnlyImpressionReportList.get(i2)).intValue(), 1, "117361");
                    }
                }
                MOfferModel.this.release();
            } catch (Exception e) {
                q0.b(MOfferModel.TAG, e.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class e implements com.mbridge.msdk.video.dynview.moffer.d {
        public e() {
        }

        @Override // com.mbridge.msdk.video.dynview.moffer.d
        public void a() {
            if (MOfferModel.this.viewMofferLayout != null && MOfferModel.this.viewMofferLayout.getVisibility() != 0) {
                com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, MOfferModel.this.mContext, "more offer show fail", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
            }
            MOfferModel.this.release();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            MOfferModel.this.checkViewVisiableState();
            return false;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class g implements View.OnClickListener {
        final /* synthetic */ int a;
        final /* synthetic */ View b;

        public g(int i, View view) {
            this.a = i;
            this.b = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CampaignEx campaignEx;
            try {
                if (MOfferModel.this.mCampaignUnit == null || MOfferModel.this.mCampaignUnit.ads == null || MOfferModel.this.mCampaignUnit.ads.size() <= 0 || (campaignEx = MOfferModel.this.mCampaignUnit.ads.get(this.a)) == null) {
                    return;
                }
                if (MOfferModel.this.mNotifyListener != null) {
                    MOfferModel mOfferModel = MOfferModel.this;
                    mOfferModel.callBackClick(mOfferModel.mNotifyListener);
                }
                campaignEx.setLocalRequestId(MOfferModel.this.mCampaignUnit.getLocalRequestId());
                com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), "more offer click", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                com.mbridge.msdk.video.dynview.request.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, MOfferModel.this.mUnitId, this.b);
            } catch (Exception e) {
                q0.b(MOfferModel.TAG, e.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MOfferModel.this.mObservableScrollView != null) {
                int visibility = MOfferModel.this.mObservableScrollView.getVisibility();
                MOfferModel mOfferModel = MOfferModel.this;
                if (visibility == 0) {
                    mOfferModel.mObservableScrollView.setVisibility(8);
                } else {
                    mOfferModel.mObservableScrollView.setVisibility(0);
                }
            }
            try {
                new com.mbridge.msdk.video.dynview.ui.b().c(MOfferModel.this.mLinearLayout, 300L);
            } catch (Exception e) {
                q0.b(MOfferModel.TAG, e.getMessage());
            }
        }
    }

    public static /* synthetic */ int access$2208(MOfferModel mOfferModel) {
        int i2 = mOfferModel.bitmapSuccessCount;
        mOfferModel.bitmapSuccessCount = i2 + 1;
        return i2;
    }

    private void addLikeTextView() {
        TextView textView;
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null || (textView = (TextView) mBridgeRelativeLayout.findViewById(findID("mbridge_reward_end_card_like_tv"))) == null) {
            return;
        }
        textView.setTextColor(Color.parseColor("#FF000000"));
        textView.setTextSize(10.0f);
        if (m0.p(com.mbridge.msdk.foundation.controller.c.n().d()).contains("zh")) {
            textView.setEms(1);
            textView.getLayoutParams().width = lnb.c(30.0f);
            textView.setText("猜你喜欢");
        } else {
            textView.setText("Just\nfor\nYou");
        }
        textView.setOnClickListener(new i());
    }

    private View buildItemView(int i2) {
        com.mbridge.msdk.foundation.same.report.metrics.c a2;
        Context context = this.mContext;
        if (context == null) {
            return null;
        }
        View inflate = LayoutInflater.from(this.mContext).inflate(i0.a(context, "mbridge_reward_end_card_more_offer_item", TtmlNode.TAG_LAYOUT), (ViewGroup) null, false);
        int a3 = i0.a(this.mContext, "mbridge_reward_end_card_item_iv", "id");
        if (inflate == null) {
            return null;
        }
        setOfferData(this.mCampaignUnit.getAds(), i2, (RoundImageView) inflate.findViewById(a3), (TextView) inflate.findViewById(i0.a(this.mContext, "mbridge_reward_end_card_item_title_tv", "id")));
        CampaignEx campaignEx = this.mCampaignUnit.getAds().get(0);
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 295);
        if (TextUtils.isEmpty(campaignEx.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        if (TextUtils.isEmpty(this.mCampaignUnit.getLocalRequestId())) {
            a2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(false, campaignEx.getBidToken(), eVar, campaignEx, this.mUnitId);
        } else {
            campaignEx.setLocalRequestId(this.mCampaignUnit.getLocalRequestId());
            a2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(this.mCampaignUnit.getLocalRequestId());
        }
        b1.a(inflate, a2.t(), campaignEx.getLocalAllowTrackClick());
        this.mCampaignUnit.setLocalRequestId(a2.t());
        inflate.setOnClickListener(new g(i2, inflate));
        return inflate;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:5|(1:7)|8|9|10|(22:14|15|(1:17)(1:54)|18|19|(1:21)(1:53)|22|23|(1:25)(1:52)|26|(2:28|(1:30))(1:51)|31|(1:33)(1:50)|34|(1:36)(1:49)|37|38|39|40|(1:42)(1:45)|43|44)|56|15|(0)(0)|18|19|(0)(0)|22|23|(0)(0)|26|(0)(0)|31|(0)(0)|34|(0)(0)|37|38|39|40|(0)(0)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e8, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void buildRequestParams(CampaignEx campaignEx) {
        String str;
        String str2;
        String str3;
        String str4;
        int adType;
        boolean isEmpty;
        boolean isEmpty2;
        String str5;
        if (campaignEx == null) {
            return;
        }
        this.mParam = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        String campaignUnitId = campaignEx.getCampaignUnitId();
        String id = campaignEx.getId();
        String requestIdNotice = campaignEx.getRequestIdNotice();
        campaignEx.getRequestId();
        String a2 = c1.a(campaignEx.getendcard_url(), "mof_testuid");
        if (TextUtils.isEmpty(a2)) {
            a2 = c1.a(campaignEx.getendcard_url(), "mof_uid");
        }
        String b2 = com.mbridge.msdk.foundation.controller.c.n().b();
        if (!TextUtils.isEmpty(b2) && com.mbridge.msdk.setting.i.b().f(b2) != null) {
            str = com.mbridge.msdk.setting.i.b().f(b2).k();
            String a3 = c1.a(campaignEx.getendcard_url(), "mcc");
            String a4 = c1.a(campaignEx.getendcard_url(), "mnc");
            String a5 = c1.a(campaignEx.getendcard_url(), "rv_tid");
            String a6 = !campaignEx.getendcard_url().contains("ecid") ? c1.a(campaignEx.getendcard_url(), "ecid") : String.valueOf(campaignEx.getEcTemplateId());
            str2 = a2;
            String a7 = c1.a(campaignEx.getendcard_url(), "tplgp");
            String str6 = str;
            String a8 = c1.a(campaignEx.getendcard_url(), "v_fmd5");
            String a9 = c1.a(campaignEx.getendcard_url(), "i_fmd5");
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.n().b());
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = this.mParam;
            StringBuilder q = fc6.q(b2);
            q.append(com.mbridge.msdk.foundation.controller.c.n().c());
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", SameMD5.getMD5(q.toString()));
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar2 = this.mParam;
            String str7 = "";
            if (TextUtils.isEmpty(requestIdNotice)) {
                str3 = "sign";
                str4 = requestIdNotice;
            } else {
                str3 = "sign";
                str4 = "";
            }
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar2, "r_id", str4);
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "e", Arrays.toString(new String[]{id}));
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof_type", "1");
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "h5_type", "1");
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof", "1");
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "country_code", !TextUtils.isEmpty(str6) ? "CN" : str6);
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof_ver", "1");
            this.mParam.a("parent_exchange", "");
            adType = campaignEx.getAdType();
            if (adType != 94) {
                str7 = "rewarded_video";
            } else if (adType == 287) {
                str7 = "interstitial_video";
            }
            this.mParam.a("parent_ad_type", str7);
            this.mParam.a("oneId", campaignEx.getReq_ext_data());
            isEmpty = TextUtils.isEmpty(a6);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar3 = this.mParam;
            if (isEmpty) {
                eVar3.a("parent_template_id", a6);
            } else {
                eVar3.a("parent_template_id", "404");
            }
            isEmpty2 = TextUtils.isEmpty(str2);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar4 = this.mParam;
            if (isEmpty2) {
                com.mbridge.msdk.foundation.same.net.utils.b.a(eVar4, "parent_unit", campaignUnitId);
            } else {
                com.mbridge.msdk.foundation.same.net.utils.b.a(eVar4, "uc_parent_unit", campaignUnitId);
            }
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mnc", a4);
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mcc", a3);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("crt_cid", id);
            jSONObject.put("crt_rid", requestIdNotice);
            jSONObject.put("rv_tid", a5);
            jSONObject.put("ecid", a6);
            jSONObject.put("tplgp", a7);
            jSONObject.put("v_fmd5", a8);
            jSONObject.put("i_fmd5", a9);
            jSONObject.put("h5_t", 1);
            jSONObject.put("mof_t", 1);
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof_data", jSONObject.toString());
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "offer_id", id);
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "offset", "0");
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "category", "0");
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "only_impression", "1");
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "ping_mode", "1");
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "http_req", "2");
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "ad_num", "20");
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "tnum", "20");
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "api_version", "2.3");
            if (TextUtils.isEmpty(str2)) {
                str5 = str2;
            } else {
                com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, MBridgeConstans.APP_ID, "92762");
                com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, str3, SameMD5.getMD5("92762936dcbdd57fe235fd7cf61c2e93da3c4"));
                str5 = "117361";
            }
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, MBridgeConstans.PROPERTIES_UNIT_ID, str5);
            com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "dy_view", "1");
        }
        str = "CN";
        String a32 = c1.a(campaignEx.getendcard_url(), "mcc");
        String a42 = c1.a(campaignEx.getendcard_url(), "mnc");
        String a52 = c1.a(campaignEx.getendcard_url(), "rv_tid");
        if (!campaignEx.getendcard_url().contains("ecid")) {
        }
        str2 = a2;
        String a72 = c1.a(campaignEx.getendcard_url(), "tplgp");
        String str62 = str;
        String a82 = c1.a(campaignEx.getendcard_url(), "v_fmd5");
        String a92 = c1.a(campaignEx.getendcard_url(), "i_fmd5");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.n().b());
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar5 = this.mParam;
        StringBuilder q2 = fc6.q(b2);
        q2.append(com.mbridge.msdk.foundation.controller.c.n().c());
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar5, "sign", SameMD5.getMD5(q2.toString()));
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar22 = this.mParam;
        String str72 = "";
        if (TextUtils.isEmpty(requestIdNotice)) {
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar22, "r_id", str4);
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "e", Arrays.toString(new String[]{id}));
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof_type", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "h5_type", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "country_code", !TextUtils.isEmpty(str62) ? "CN" : str62);
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof_ver", "1");
        this.mParam.a("parent_exchange", "");
        adType = campaignEx.getAdType();
        if (adType != 94) {
        }
        this.mParam.a("parent_ad_type", str72);
        this.mParam.a("oneId", campaignEx.getReq_ext_data());
        isEmpty = TextUtils.isEmpty(a6);
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar32 = this.mParam;
        if (isEmpty) {
        }
        isEmpty2 = TextUtils.isEmpty(str2);
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar42 = this.mParam;
        if (isEmpty2) {
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mnc", a42);
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mcc", a32);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("crt_cid", id);
        jSONObject2.put("crt_rid", requestIdNotice);
        jSONObject2.put("rv_tid", a52);
        jSONObject2.put("ecid", a6);
        jSONObject2.put("tplgp", a72);
        jSONObject2.put("v_fmd5", a82);
        jSONObject2.put("i_fmd5", a92);
        jSONObject2.put("h5_t", 1);
        jSONObject2.put("mof_t", 1);
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof_data", jSONObject2.toString());
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "offer_id", id);
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "offset", "0");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "category", "0");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "http_req", "2");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "ad_num", "20");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "tnum", "20");
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "api_version", "2.3");
        if (TextUtils.isEmpty(str2)) {
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, MBridgeConstans.PROPERTIES_UNIT_ID, str5);
        com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "dy_view", "1");
    }

    private void buildScrollViewGroup() {
        if (this.mContext == null || this.viewMofferLayout == null || this.mMainOfferCampaignEx == null) {
            return;
        }
        this.mLinearLayout = new LinearLayout(this.mContext);
        this.mLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.mLinearLayout.setOrientation(0);
        this.mLinearLayout.setGravity(17);
        for (int i2 = 0; i2 < this.mCampaignUnit.ads.size(); i2++) {
            View buildItemView = buildItemView(i2);
            if (buildItemView != null) {
                this.mLinearLayout.addView(buildItemView);
            }
        }
        this.mObservableScrollView.addView(this.mLinearLayout);
        this.mObservableScrollView.setOnTouchListener(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callBackClick(com.mbridge.msdk.video.module.listener.a aVar) {
        if (aVar == null) {
            return;
        }
        aVar.a(128, "");
    }

    private void createMoreOfferList() {
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null) {
            return;
        }
        this.mObservableScrollView = (ObservableScrollView) mBridgeRelativeLayout.findViewById(findID("mbridge_moreoffer_hls"));
        buildScrollViewGroup();
        addLikeTextView();
        showView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createMoreOfferView() {
        CampaignUnit campaignUnit = this.mCampaignUnit;
        if (campaignUnit == null || this.mContext == null || campaignUnit.getAds() == null || this.mCampaignUnit.getAds().size() == 0) {
            return;
        }
        setMoreOfferLayoutCallBack();
        createMoreOfferList();
    }

    private void doAdmfContorl() {
        try {
            CampaignEx campaignEx = this.mMainOfferCampaignEx;
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getMoreOfferJsonData())) {
                JSONObject jSONObject = new JSONObject(this.mMainOfferCampaignEx.getMoreOfferJsonData());
                int i2 = this.mFromType;
                JSONObject jSONObject2 = i2 != 1 ? i2 != 2 ? null : jSONObject.getJSONObject(CampaignEx.ENDCARD_URL) : jSONObject.getJSONObject("template_url");
                if (jSONObject2 == null) {
                    return;
                }
                if (jSONObject2.has(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM)) {
                    this.admftm = jSONObject2.getInt(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM);
                }
                if (jSONObject2.has(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF)) {
                    this.admf = jSONObject2.getInt(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF);
                }
            }
        } catch (Exception e2) {
            q0.b(TAG, e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doControllableImpOnRequest() {
        CampaignUnit campaignUnit = this.mCampaignUnit;
        if (campaignUnit == null) {
            return;
        }
        try {
            com.mbridge.msdk.video.dynview.request.a.a(campaignUnit, 0, 1, "117361");
            this.isOnlyImpShow = true;
            if (this.mCampaignUnit.getAds() == null) {
                return;
            }
            int size = this.mCampaignUnit.getAds().size();
            if (this.admf >= size) {
                this.admf = size;
            }
            if (this.mImpressionId == null) {
                this.mImpressionId = new ArrayList();
            }
            for (int i2 = 0; i2 < this.admf; i2++) {
                if (!this.mImpressionId.contains(Integer.valueOf(i2))) {
                    com.mbridge.msdk.video.dynview.request.a.a(this.mCampaignUnit, i2, 0, "117361");
                    this.mImpressionId.add(Integer.valueOf(i2));
                }
            }
        } catch (Exception e2) {
            q0.b(TAG, e2.getMessage());
        }
    }

    private void doControllableImpOnShow(int i2) {
        CampaignUnit campaignUnit = this.mCampaignUnit;
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return;
        }
        try {
            int size = this.mCampaignUnit.getAds().size();
            int i3 = this.mControlShowSize;
            if (i3 == 0) {
                i3 = this.admf + i2;
                this.mControlShowSize = i3;
            }
            if (i3 >= size) {
                this.mControlShowSize = size;
            }
            while (i2 < this.mControlShowSize) {
                if (!this.mImpressionId.contains(Integer.valueOf(i2))) {
                    com.mbridge.msdk.video.dynview.request.a.a(this.mCampaignUnit, i2, 0, "117361");
                    this.mImpressionId.add(Integer.valueOf(i2));
                }
                i2++;
            }
        } catch (Exception e2) {
            q0.b(TAG, e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findID(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "id");
    }

    private void initData() {
        CampaignEx campaignEx = this.mMainOfferCampaignEx;
        if (campaignEx == null || this.mContext == null) {
            return;
        }
        buildRequestParams(campaignEx);
        if (this.mParam == null) {
            return;
        }
        com.mbridge.msdk.video.dynview.request.b bVar = new com.mbridge.msdk.video.dynview.request.b(this.mContext);
        c cVar = new c();
        String str = com.mbridge.msdk.foundation.same.net.utils.d.h().Z;
        if (!TextUtils.isEmpty(this.mMainOfferCampaignEx.getReq_ext_data())) {
            try {
                JSONObject jSONObject = new JSONObject(this.mMainOfferCampaignEx.getReq_ext_data());
                String optString = jSONObject.optString("mof_domain");
                if (!TextUtils.isEmpty(optString)) {
                    str = optString + "/openapi/ad/v3";
                }
                String optString2 = jSONObject.optString("parent_id");
                if (!TextUtils.isEmpty(optString2)) {
                    com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mof_parent_id", optString2);
                }
                String optString3 = jSONObject.optString("oneId");
                if (!TextUtils.isEmpty(optString3)) {
                    com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "oneId", optString3);
                }
                String optString4 = jSONObject.optString("mcd");
                if (!TextUtils.isEmpty(optString4)) {
                    com.mbridge.msdk.foundation.same.net.utils.b.a(this.mParam, "mcd", optString4);
                }
                cVar.setUnitId(this.mMainOfferCampaignEx.getCampaignUnitId());
            } catch (Exception e2) {
                q0.b(TAG, e2.getMessage());
                str = com.mbridge.msdk.foundation.same.net.utils.d.h().Z;
            }
        }
        String str2 = str;
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (this.mIsRetry) {
            eVar.a("retry", "1");
        }
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mof_initiate", this.mMainOfferCampaignEx, eVar);
        bVar.getLoadOrSetting(1, str2, this.mParam, cVar, true, "more_offer", CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        doAdmfContorl();
    }

    private void initView() {
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        this.viewMofferLayout = (MBridgeRelativeLayout) LayoutInflater.from(this.mContext).inflate(i0.a(context, "mbridge_reward_more_offer_view", TtmlNode.TAG_LAYOUT), (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        List<Integer> list = this.cacheImpressionReportList;
        if (list != null) {
            list.clear();
            this.cacheImpressionReportList = null;
        }
        List<Integer> list2 = this.cacheOnlyImpressionReportList;
        if (list2 != null) {
            list2.clear();
            this.cacheOnlyImpressionReportList = null;
        }
    }

    private void setCallbackForLogicVisibleView(View view, int i2) {
        if (view == null) {
            return;
        }
        try {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            boolean z = rect.width() > view.getMeasuredWidth() / 5;
            if (!globalVisibleRect || !z) {
                if (this.admf != 0) {
                    doControllableImpOnShow(i2);
                    return;
                }
                return;
            }
            List<Integer> list = this.mImpressionId;
            if (list != null && this.onItemExposeListener != null && !list.contains(Integer.valueOf(i2))) {
                this.mImpressionId.add(Integer.valueOf(i2));
                this.onItemExposeListener.onItemViewVisible(true, i2);
            }
        } catch (Exception e2) {
            q0.b(TAG, e2.getMessage());
        }
    }

    private void setMoreOfferLayoutCallBack() {
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null) {
            return;
        }
        mBridgeRelativeLayout.setMoreOfferCacheReportCallBack(new d());
        this.viewMofferLayout.setMoreOfferShowFailedCallBack(new e());
    }

    private void setOfferData(List<CampaignEx> list, int i2, RoundImageView roundImageView, TextView textView) {
        CampaignEx campaignEx;
        if (roundImageView == null || textView == null || list == null || this.mContext == null || this.mMainOfferCampaignEx == null || list.size() <= 0 || (campaignEx = list.get(i2)) == null) {
            return;
        }
        roundImageView.setImageDrawable(null);
        com.mbridge.msdk.foundation.same.image.b.a(this.mContext).a(campaignEx.getIconUrl(), new h(roundImageView));
        if (TextUtils.isEmpty(campaignEx.getAppName())) {
            return;
        }
        String a2 = c1.a(this.mMainOfferCampaignEx.getendcard_url(), "mof_textmod");
        if (TextUtils.isEmpty(a2) || !a2.equals("1")) {
            textView.setVisibility(8);
        } else {
            textView.setText(campaignEx.getAppName());
        }
    }

    public void buildMofferAd(CampaignEx campaignEx) {
        Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
        this.mContext = d2;
        if (d2 == null) {
            return;
        }
        this.mMainOfferCampaignEx = campaignEx;
        initView();
        initData();
    }

    public void checkViewVisiableState() {
        if (this.mLinearLayout == null) {
            return;
        }
        for (int i2 = 0; i2 < this.mLinearLayout.getChildCount(); i2++) {
            try {
                setCallbackForLogicVisibleView(this.mLinearLayout.getChildAt(i2), i2);
            } catch (Exception e2) {
                q0.b(TAG, e2.getMessage());
                return;
            }
        }
    }

    public long getECParentTemplateCode() {
        try {
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = this.mParam;
            String str = eVar != null ? eVar.a().get("parent_template_id") : "";
            if (TextUtils.isEmpty(str)) {
                return 404L;
            }
            return Long.parseLong(str);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return 404L;
        }
    }

    public CampaignEx getmMainOfferCampaignEx() {
        return this.mMainOfferCampaignEx;
    }

    public void mofDestroy() {
        if (this.mMoreOfferLayoutListener != null) {
            this.mMoreOfferLayoutListener = null;
        }
        if (this.onItemExposeListener != null) {
            this.onItemExposeListener = null;
        }
        if (this.mMoreOfferShowCallBack != null) {
            this.mMoreOfferShowCallBack = null;
        }
        if (this.mNotifyListener != null) {
            this.mNotifyListener = null;
        }
    }

    public void setFromType(int i2) {
        this.mFromType = i2;
    }

    public void setIsRetry(boolean z) {
        this.mIsRetry = z;
    }

    public void setMoreOfferListener(com.mbridge.msdk.video.dynview.listener.g gVar, com.mbridge.msdk.video.module.listener.a aVar) {
        this.mMoreOfferLayoutListener = gVar;
        this.mNotifyListener = aVar;
    }

    public void showView() {
        CampaignUnit campaignUnit;
        com.mbridge.msdk.video.dynview.listener.g gVar = this.mMoreOfferLayoutListener;
        if (gVar == null) {
            return;
        }
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null || (campaignUnit = this.mCampaignUnit) == null) {
            gVar.a(-1, "more Offer create fail");
            return;
        }
        gVar.a(mBridgeRelativeLayout, campaignUnit);
        if (!this.isOnlyImpShow) {
            com.mbridge.msdk.video.dynview.request.a.a(this.mCampaignUnit, 0, 1, "117361");
        }
        if (this.mHasReportMofScenes) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("scene", this.mFromType + "");
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mof_scenes", this.mMainOfferCampaignEx, eVar);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class h implements com.mbridge.msdk.foundation.same.image.c {
        final /* synthetic */ RoundImageView a;

        public h(RoundImageView roundImageView) {
            this.a = roundImageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (this.a != null && bitmap != null && !bitmap.isRecycled()) {
                    this.a.setBorderRadius(13);
                    this.a.setImageBitmap(bitmap);
                }
                MOfferModel.access$2208(MOfferModel.this);
                if (MOfferModel.this.isShowMoreOffer || MOfferModel.this.bitmapSuccessCount < 5 || MOfferModel.this.mMoreOfferShowCallBack == null) {
                    return;
                }
                MOfferModel.this.isShowMoreOffer = true;
                MOfferModel.this.mMoreOfferShowCallBack.a(null);
            } catch (Exception e) {
                q0.b(MOfferModel.TAG, e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c extends com.mbridge.msdk.video.dynview.request.abs.a {
        public c() {
        }

        @Override // com.mbridge.msdk.video.dynview.request.abs.a
        public void a(List<com.mbridge.msdk.tracker.network.g> list, CampaignUnit campaignUnit) {
            if (MOfferModel.this.mParam == null || campaignUnit == null) {
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
                return;
            }
            try {
                MOfferModel mOfferModel = MOfferModel.this;
                mOfferModel.mUnitId = mOfferModel.mParam.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
                MOfferModel mOfferModel2 = MOfferModel.this;
                mOfferModel2.mRid = mOfferModel2.mParam.a().get("r_id");
                if (campaignUnit.getAds() == null || campaignUnit.getAds().size() < 5) {
                    if (!MOfferModel.this.hasReportMoreOfferLoad) {
                        com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), "more offer load failed errorCode: -999 errorMsg: The campaign quantity less than 5.", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                        MOfferModel.this.hasReportMoreOfferLoad = true;
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("result", "2");
                    eVar.a("code", MOfferModel.MOF_LOAD_RESULT_CODE_OFFER_LESS_THAN_5);
                    if (MOfferModel.this.mIsRetry) {
                        eVar.a("retry", "1");
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mof_req_result", MOfferModel.this.mMainOfferCampaignEx, eVar);
                    com.mbridge.msdk.video.dynview.moffer.a.a().b();
                    return;
                }
                MOfferModel.this.mCampaignUnit = campaignUnit;
                if (MOfferModel.this.admf > 0 && MOfferModel.this.admftm == 1) {
                    MOfferModel.this.doControllableImpOnRequest();
                }
                if (!MOfferModel.this.hasReportMoreOfferLoad) {
                    com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), "more offer load success", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                    MOfferModel.this.hasReportMoreOfferLoad = true;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar2.a("result", "1");
                if (MOfferModel.this.mIsRetry) {
                    eVar2.a("retry", "1");
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mof_req_result", MOfferModel.this.mMainOfferCampaignEx, eVar2);
                MOfferModel.this.createMoreOfferView();
            } catch (Exception e) {
                q0.b(MOfferModel.TAG, e.getMessage());
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
            }
        }

        @Override // com.mbridge.msdk.video.dynview.request.abs.a
        public void a(int i, String str) {
            if (MOfferModel.this.mParam == null) {
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
                return;
            }
            try {
                MOfferModel mOfferModel = MOfferModel.this;
                mOfferModel.mUnitId = mOfferModel.mParam.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
                MOfferModel mOfferModel2 = MOfferModel.this;
                mOfferModel2.mRid = mOfferModel2.mParam.a().get("r_id");
                if (!MOfferModel.this.hasReportMoreOfferLoad) {
                    com.mbridge.msdk.video.dynview.request.a.a(MOfferModel.this.mMainOfferCampaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), "more offer load failed errorCode:" + i + "errorMsg:" + str, MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                    MOfferModel.this.hasReportMoreOfferLoad = true;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", "2");
                eVar.a("code", i + "");
                if (MOfferModel.this.mIsRetry) {
                    eVar.a("retry", "1");
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mof_req_result", MOfferModel.this.mMainOfferCampaignEx, eVar);
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
            } catch (Exception e) {
                q0.b(MOfferModel.TAG, e.getMessage());
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
            }
        }
    }
}
