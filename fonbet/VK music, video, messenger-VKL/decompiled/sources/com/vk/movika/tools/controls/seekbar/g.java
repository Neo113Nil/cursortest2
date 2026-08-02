package com.vk.movika.tools.controls.seekbar;

import android.content.Context;
import android.content.res.Resources;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vk.core.view.components.skeleton.VkTextSkeleton;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebLegalInfo;
import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.reporters.api.engine.LongPollHistoryReporter;
import com.vk.im.ui.fragments.ImChatSettingsFragment;
import com.vk.music.player.LoopMode;
import com.vk.permission.PermissionHelper;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.stat.scheme.MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt;
import com.vk.stat.scheme.MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Parameters;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import one.video.stat.transport.internal.upload.UploadExecutionResult;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.a1w;
import xsna.aef0;
import xsna.cck0;
import xsna.dbq0;
import xsna.dg70;
import xsna.e370;
import xsna.e3m;
import xsna.e43;
import xsna.exi0;
import xsna.f5p;
import xsna.g5y;
import xsna.g7q0;
import xsna.gd5;
import xsna.gzs;
import xsna.h400;
import xsna.hx30;
import xsna.i2c;
import xsna.i400;
import xsna.ix30;
import xsna.izs;
import xsna.jtb;
import xsna.k9x;
import xsna.kef0;
import xsna.mdz;
import xsna.mms;
import xsna.nlh0;
import xsna.o43;
import xsna.ofl0;
import xsna.olh0;
import xsna.oxz;
import xsna.pli;
import xsna.plz;
import xsna.q010;
import xsna.q630;
import xsna.qcw;
import xsna.r170;
import xsna.r3;
import xsna.r9f0;
import xsna.rdu;
import xsna.rf70;
import xsna.rl3;
import xsna.s200;
import xsna.s2d;
import xsna.s3q0;
import xsna.s3w0;
import xsna.sex0;
import xsna.sw30;
import xsna.sx40;
import xsna.tms;
import xsna.txj0;
import xsna.u6d;
import xsna.uco;
import xsna.uns;
import xsna.vlm;
import xsna.w2d;
import xsna.wh50;
import xsna.wn6;
import xsna.wto0;
import xsna.ww50;
import xsna.x7y;
import xsna.xwv0;
import xsna.xx30;
import xsna.xyb;
import xsna.zak0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        VkCheckbox.State state;
        WebApiApplication v;
        VkUiView view;
        String str;
        wto0 wto0Var;
        Long a;
        String str2;
        int i = this.b;
        int i2 = 14;
        int i3 = 10;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return DefaultSeekBarView.d((Context) obj2, (DefaultSeekBarView) obj);
            case 1:
                wh50 wh50Var = (wh50) obj2;
                gzs gzsVar = (gzs) obj;
                int i4 = i2c.b.$EnumSwitchMapping$1[((VkCheckbox.State) wh50Var.getValue()).ordinal()];
                if (i4 == 1) {
                    state = VkCheckbox.State.Checked;
                } else if (i4 == 2) {
                    state = VkCheckbox.State.Checked;
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    state = VkCheckbox.State.Unchecked;
                }
                wh50Var.setValue(state);
                gzsVar.invoke();
                return s3q0.a;
            case 2:
                nlh0 nlh0Var = (nlh0) obj;
                if (((VideoFile) obj2) instanceof ClipVideoFile) {
                    nlh0Var.d(Collections.singletonList(new olh0.d(false)));
                }
                return s3q0.a;
            case 3:
                s2d s2dVar = (s2d) obj2;
                return new w2d(s2dVar.a.a().getContext(), (u6d) obj, s2dVar.b);
            case 4:
                com.vk.core.compose.component.datetime.g gVar = new com.vk.core.compose.component.datetime.g((k9x) obj2, (com.vk.core.compose.component.datetime.l) obj, false);
                com.vk.core.compose.component.datetime.m mVar = gVar.a;
                com.vk.core.compose.component.datetime.b a2 = mVar.a();
                a2.b(com.vk.core.compose.component.datetime.f.a);
                a2.b(com.vk.core.compose.component.datetime.f.c);
                s3q0 s3q0Var = s3q0.a;
                ((zak0) mVar.a).setValue(mVar.a());
                return gVar;
            case 5:
                return new SimpleDateFormat(((Context) obj2).getString(R.string.vkim_dialogs_list_time_yesterday), ((vlm) obj).f);
            case 6:
                return "onFileLoadFinishedCallback: uploadFile= " + ((dbq0) obj2).a + ", result= " + ((UploadExecutionResult) obj);
            case 7:
                ((tms) obj2).a.a(new mms.d(((uns.a.d) obj).a, false));
                return s3q0.a;
            case 8:
                ArrayList arrayList = (ArrayList) obj;
                xyb xybVar = ((ImChatSettingsFragment) obj2).Q;
                (xybVar == null ? null : xybVar).b1(0, arrayList);
                return s3q0.a;
            case 9:
                g5y g5yVar = (g5y) obj2;
                GetGeodata$Parameters getGeodata$Parameters = (GetGeodata$Parameters) obj;
                FragmentActivity fragmentActivity = (FragmentActivity) g5yVar.j.invoke();
                if (fragmentActivity == null || fragmentActivity.isDestroyed() || fragmentActivity.isFinishing()) {
                    g5yVar.c().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), getGeodata$Parameters.c(), 1, null));
                } else {
                    sex0 sex0Var = e370.l;
                    if (sex0Var == null) {
                        sex0Var = null;
                    }
                    sex0Var.getClass();
                    if (oxz.g(fragmentActivity)) {
                        PermissionHelper permissionHelper = PermissionHelper.a;
                        permissionHelper.getClass();
                        String[] strArr = PermissionHelper.h;
                        String[] strArr2 = PermissionHelper.i;
                        Resources resources = fragmentActivity.getResources();
                        xwv0 xwv0Var = g5yVar.g;
                        String str3 = (xwv0Var == null || (v = xwv0Var.v()) == null) ? null : v.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        PermissionHelper.j(permissionHelper, fragmentActivity, strArr, strArr2, resources.getString(R.string.vk_apps_location_permission, str3), 0, new jtb(g5yVar, getGeodata$Parameters, fragmentActivity, 2), new o43(24, g5yVar, getGeodata$Parameters), 400);
                    } else {
                        g5yVar.j(getGeodata$Parameters.c());
                    }
                }
                return s3q0.a;
            case 10:
                String str4 = (String) obj;
                xwv0 xwv0Var2 = ((x7y) obj2).d;
                if (xwv0Var2 != null && (view = xwv0Var2.getView()) != null) {
                    view.Jb(str4);
                }
                return s3q0.a;
            case 11:
                plz.a.C3518a c3518a = (plz.a.C3518a) obj;
                ww50 v2 = s200.v(((plz) obj2).requireContext());
                if (v2 != null) {
                    v2.S(c3518a);
                }
                return s3q0.a;
            case 12:
                h400 h400Var = (h400) obj2;
                mdz mdzVar = (mdz) obj;
                AtomicBoolean atomicBoolean = h400.j;
                ReporterType reporterType = h400Var.i;
                int[] iArr = h400.a.$EnumSwitchMapping$1;
                int i5 = iArr[reporterType.ordinal()];
                if (i5 != 1 && i5 != 2) {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    atomicBoolean = h400.k;
                }
                boolean andSet = atomicBoolean.getAndSet(false);
                Name name = mdzVar.b;
                LongPollHistoryReporter.Span span = LongPollHistoryReporter.Span.ROOT;
                if ((name == span ? mdzVar : null) != null && (wto0Var = (wto0) h400Var.c.get(mdzVar)) != null && (a = wto0Var.a()) != null) {
                    LinkedHashMap r = h400Var.r();
                    Long m = pli.m((Collection) r.get(LongPollHistoryReporter.Span.REQUEST));
                    Long m2 = pli.m((Collection) r.get(LongPollHistoryReporter.Span.BUILD_TASKS));
                    Long m3 = pli.m((Collection) r.get(LongPollHistoryReporter.Span.PREPARE_TASKS));
                    Long m4 = pli.m((Collection) r.get(LongPollHistoryReporter.Span.MISSED_TOTAL));
                    Long s = pli.s((Collection) r.get(LongPollHistoryReporter.Span.MISSED_CONTACTS));
                    Long s2 = pli.s((Collection) r.get(LongPollHistoryReporter.Span.MISSED_USERS));
                    Long s3 = pli.s((Collection) r.get(LongPollHistoryReporter.Span.MISSED_EMAILS));
                    Long s4 = pli.s((Collection) r.get(LongPollHistoryReporter.Span.MISSED_GROUPS));
                    Long s5 = pli.s((Collection) r.get(LongPollHistoryReporter.Span.MISSED_CONVERSATIONS));
                    Long s6 = pli.s((Collection) r.get(LongPollHistoryReporter.Span.MISSED_CHAT_INFOS));
                    Long s7 = pli.s((Collection) r.get(LongPollHistoryReporter.Span.MISSED_MESSAGES));
                    Long s8 = pli.s((Collection) r.get(LongPollHistoryReporter.Span.MISSED_CHANNELS));
                    Long s9 = pli.s((Collection) r.get(LongPollHistoryReporter.Span.MISSED_CHANNELS_MESSAGES));
                    Long s10 = pli.s((Collection) r.get(LongPollHistoryReporter.Span.MISSED_CHANNELS_COUNTERS));
                    Long s11 = pli.s((Collection) r.get(LongPollHistoryReporter.Span.MISSED_INCOGNITOS));
                    Long m5 = pli.m((Collection) r.get(LongPollHistoryReporter.Span.SYNC_CHANGES));
                    Long m6 = pli.m((Collection) r.get(LongPollHistoryReporter.Span.NOTIFY_ENVIRONMENT));
                    int i6 = iArr[reporterType.ordinal()];
                    if (i6 == 1) {
                        str2 = "messages";
                    } else if (i6 == 2) {
                        str2 = "group_messages";
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = RTCStatsConstants.KEY_CHANNELS;
                    }
                    String str5 = str2;
                    s3w0 s3w0Var = new s3w0(PerformanceEventType.LONG_POLL_HISTORY.h(), false);
                    Long[] lArr = s3w0Var.j;
                    lArr[0] = a;
                    String[] strArr3 = s3w0Var.i;
                    strArr3[1] = str5;
                    lArr[2] = m;
                    lArr[3] = m2;
                    lArr[4] = m3;
                    lArr[5] = m4;
                    lArr[6] = s;
                    lArr[7] = s2;
                    lArr[8] = s3;
                    lArr[9] = s4;
                    lArr[10] = s5;
                    lArr[11] = s6;
                    lArr[12] = s7;
                    lArr[13] = s8;
                    lArr[14] = s9;
                    lArr[15] = s10;
                    strArr3[2] = m5 != null ? m5.toString() : null;
                    strArr3[3] = m6 != null ? m6.toString() : null;
                    strArr3[5] = "0";
                    strArr3[6] = andSet ? "1" : "0";
                    strArr3[7] = s11 != null ? s11.toString() : null;
                    s3w0Var.q();
                }
                if ((mdzVar.b == span ? mdzVar : null) != null) {
                    h400Var.q(rl3.C(LongPollHistoryReporter.Span.values()), mdzVar);
                    int i7 = iArr[reporterType.ordinal()];
                    if (i7 == 1) {
                        str = "messages";
                    } else if (i7 == 2) {
                        str = "group_messages";
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = RTCStatsConstants.KEY_CHANNELS;
                    }
                    wn6.w(h400Var, mdzVar, new gd5(span, PerformanceEventType.LONG_POLL_HISTORY.h(), i400.b, 2), Collections.singletonList(new MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr(1, str)), e43.l(new MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt(1, andSet ? 1 : 0), new MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt(2, 0)), 28);
                }
                return s3q0.a;
            case 13:
                sw30 sw30Var = (sw30) obj;
                return new r9f0(Source.NETWORK, (a1w) obj2, new hx30(1, sw30Var, xx30.a.class, "isDialogAllowed", "isDialogAllowed(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0), new ix30(1, sw30Var, xx30.a.class, "isDialogActive", "isDialogActive(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0));
            case 14:
                q010 q010Var = (q010) obj;
                if (((r170) obj2).a.get() == 0) {
                    q010Var.invoke();
                }
                return s3q0.a;
            case 15:
                ((dg70.i.a) obj).getClass();
                ((izs) obj2).invoke(new rf70.d(true));
                return s3q0.a;
            case 16:
                return PhotoEditorView.f((PhotoEditorView) obj2, (f5p) obj);
            case 17:
                ((izs) obj2).invoke(new aef0.a(((kef0) obj).b));
                return s3q0.a;
            case 18:
                ((izs) obj2).invoke(new sx40.n0((LoopMode) obj));
                return s3q0.a;
            case 19:
                long j = ((uco) ((wh50) obj).getValue()).a;
                ((ofl0) obj2).getClass();
                return rdu.a(txj0.r((Float.floatToRawIntBits(uco.c(j) / 4.0f) << 32) | (Float.floatToRawIntBits(uco.b(j) / 4.0f) & 4294967295L), q630.a.a), new qcw(27));
            case 20:
                g7q0 g7q0Var = (g7q0) obj;
                PermissionHelper permissionHelper2 = PermissionHelper.a;
                permissionHelper2.getClass();
                PermissionHelper.l(permissionHelper2, (FragmentActivity) obj2, PermissionHelper.b, new cck0(g7q0Var, i3), new exi0(g7q0Var, i2), 4);
                return s3q0.a;
            case 21:
                Context context = (Context) obj2;
                VkCellSkeleton vkCellSkeleton = (VkCellSkeleton) obj;
                int i8 = VkCellSkeleton.n;
                VkTextSkeleton vkTextSkeleton = new VkTextSkeleton(context, null, 6, 0);
                vkTextSkeleton.setId(R.id.ds_internal_cell_skeleton_middle_title);
                vkTextSkeleton.setArea(vkCellSkeleton.getArea());
                vkTextSkeleton.setShimmer(vkCellSkeleton.b);
                vkTextSkeleton.setShimmerManagedExternally(true);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMarginStart(e3m.a(R.dimen.vk_ui_spacing_size_l, context));
                layoutParams.setMarginEnd(e3m.a(R.dimen.vk_ui_spacing_size_l, context));
                vkTextSkeleton.setLayoutParams(layoutParams);
                vkTextSkeleton.setIncludeFontPadding(false);
                vkTextSkeleton.setTextAppearance(e3m.g(R.attr.vk_ui_typography_text, context));
                return vkTextSkeleton;
            default:
                new r3(((VkCell) obj2).getContext()).a((WebLegalInfo) obj);
                return s3q0.a;
        }
    }
}
