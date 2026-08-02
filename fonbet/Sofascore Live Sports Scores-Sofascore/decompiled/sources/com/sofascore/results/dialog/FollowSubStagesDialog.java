package com.sofascore.results.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.FollowSubStagesDialog;
import com.sofascore.results.dialog.FollowSubStagesViewModel;
import com.sofascore.results.notifications.NotificationSettingsActivity;
import com.sofascore.results.service.MuteStageWorker;
import com.sofascore.results.service.StageWorker;
import defpackage.af8;
import defpackage.duf;
import defpackage.hv7;
import defpackage.ix7;
import defpackage.joa;
import defpackage.otk;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u0014\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\nX\u008a\u0084\u0002²\u0006,\u0010\t\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00070\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/dialog/FollowSubStagesDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "kotlin.jvm.PlatformType", "toggleMute", "Ltee;", "", "subStageSelection", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FollowSubStagesDialog extends Hilt_FollowSubStagesDialog {
    public final otk v;

    public FollowSubStagesDialog() {
        joa a = ypa.a(ysa.c, new hv7(new hv7(this, 3), 4));
        this.v = new otk(duf.a.getOrCreateKotlinClass(FollowSubStagesViewModel.class), new ix7(a, 1), new z07(21, this, a), new ix7(a, 2));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        AlertDialog create = new AlertDialog.Builder(requireContext(), R.style.RedesignDialog).create();
        final int i = 0;
        create.setCanceledOnTouchOutside(false);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        final int i2 = 1;
        composeView.setContent(new tc3(-1276953606, new af8(this, i), true));
        create.setView(composeView);
        create.setButton(-1, getString(R.string.ok), new DialogInterface.OnClickListener(this) { // from class: bf8
            public final /* synthetic */ FollowSubStagesDialog b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i;
                FollowSubStagesDialog followSubStagesDialog = this.b;
                switch (i4) {
                    case 0:
                        FollowSubStagesViewModel followSubStagesViewModel = (FollowSubStagesViewModel) followSubStagesDialog.v.getValue();
                        Integer num = followSubStagesViewModel.f;
                        if (num != null) {
                            Map map = (tee) followSubStagesViewModel.k.d();
                            if (map == null) {
                                map = lm5.a;
                                map.getClass();
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                if (((Boolean) entry.getValue()).booleanValue()) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            ArrayList arrayList = new ArrayList(linkedHashMap.size());
                            Iterator it = linkedHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getKey()).intValue()));
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry2 : map.entrySet()) {
                                if (!((Boolean) entry2.getValue()).booleanValue()) {
                                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                            Iterator it2 = linkedHashMap2.entrySet().iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(Integer.valueOf(((Number) ((Map.Entry) it2.next()).getKey()).intValue()));
                            }
                            int i5 = 0;
                            if (Intrinsics.c(followSubStagesViewModel.j.d(), Boolean.TRUE)) {
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    Object next = it3.next();
                                    if (Intrinsics.c(followSubStagesViewModel.m.get(Integer.valueOf(((Number) next).intValue())), Boolean.FALSE)) {
                                        arrayList3.add(next);
                                    }
                                }
                                Iterator it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    nv.y(followSubStagesViewModel.i(), vu.UNMUTE_NOTIFICATION, xu.STAGE, ((Number) it4.next()).intValue(), wu.POPUP);
                                }
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it5 = arrayList2.iterator();
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    if (Intrinsics.c(followSubStagesViewModel.m.get(Integer.valueOf(((Number) next2).intValue())), Boolean.TRUE)) {
                                        arrayList4.add(next2);
                                    }
                                }
                                Iterator it6 = arrayList4.iterator();
                                while (it6.hasNext()) {
                                    nv.y(followSubStagesViewModel.i(), vu.MUTE_NOTIFICATION, xu.STAGE, ((Number) it6.next()).intValue(), wu.POPUP);
                                }
                                Context i6 = followSubStagesViewModel.i();
                                Pair[] pairArr = {new Pair("ACTION", "UPDATE_STAGES"), new Pair("STAGE_ID", num), new Pair("STAGE_IDS_TO_MUTE", CollectionsKt.R0(arrayList2)), new Pair("STAGE_IDS_TO_UN_MUTE", CollectionsKt.R0(arrayList))};
                                hpo hpoVar = new hpo(18);
                                while (i5 < 4) {
                                    Pair pair = pairArr[i5];
                                    hpoVar.B(pair.b, (String) pair.a);
                                    i5++;
                                }
                                md4 l = hpoVar.l();
                                vxd.h(i6).b("MuteStageWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(MuteStageWorker.class, l).a());
                            } else {
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it7 = arrayList.iterator();
                                while (it7.hasNext()) {
                                    Object next3 = it7.next();
                                    if (Intrinsics.c(followSubStagesViewModel.m.get(Integer.valueOf(((Number) next3).intValue())), Boolean.FALSE)) {
                                        arrayList5.add(next3);
                                    }
                                }
                                Iterator it8 = arrayList5.iterator();
                                while (it8.hasNext()) {
                                    nv.y(followSubStagesViewModel.i(), vu.ADD_NOTIFICATION, xu.STAGE, ((Number) it8.next()).intValue(), wu.POPUP);
                                }
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it9 = arrayList2.iterator();
                                while (it9.hasNext()) {
                                    Object next4 = it9.next();
                                    if (Intrinsics.c(followSubStagesViewModel.m.get(Integer.valueOf(((Number) next4).intValue())), Boolean.TRUE)) {
                                        arrayList6.add(next4);
                                    }
                                }
                                Iterator it10 = arrayList6.iterator();
                                while (it10.hasNext()) {
                                    nv.y(followSubStagesViewModel.i(), vu.REMOVE_NOTIFICATION, xu.STAGE, ((Number) it10.next()).intValue(), wu.POPUP);
                                }
                                Context i7 = followSubStagesViewModel.i();
                                Pair[] pairArr2 = {new Pair("ACTION", "ADD_STAGE_LIST"), new Pair("STAGE_IDS", CollectionsKt.R0(arrayList)), new Pair("WITH_SUB_STAGES", Boolean.FALSE)};
                                hpo hpoVar2 = new hpo(18);
                                for (int i8 = 0; i8 < 3; i8++) {
                                    Pair pair2 = pairArr2[i8];
                                    hpoVar2.B(pair2.b, (String) pair2.a);
                                }
                                md4 l2 = hpoVar2.l();
                                vxd.h(i7).b("StageWorker-".concat(mha.o(l2)), nf6.a, (ltd) vxd.g(StageWorker.class, l2).a());
                                Context i9 = followSubStagesViewModel.i();
                                Pair[] pairArr3 = {new Pair("ACTION", "REMOVE_STAGE_LIST"), new Pair("STAGE_IDS", CollectionsKt.R0(arrayList2))};
                                hpo hpoVar3 = new hpo(18);
                                while (i5 < 2) {
                                    Pair pair3 = pairArr3[i5];
                                    hpoVar3.B(pair3.b, (String) pair3.a);
                                    i5++;
                                }
                                md4 l3 = hpoVar3.l();
                                vxd.h(i9).b("StageWorker-".concat(mha.o(l3)), nf6.a, (ltd) vxd.g(StageWorker.class, l3).a());
                            }
                        }
                        dialogInterface.dismiss();
                        break;
                    default:
                        int i10 = NotificationSettingsActivity.O;
                        Context requireContext2 = followSubStagesDialog.requireContext();
                        requireContext2.getClass();
                        mx9.y(requireContext2);
                        break;
                }
            }
        });
        create.setButton(-3, getString(R.string.action_settings), new DialogInterface.OnClickListener(this) { // from class: bf8
            public final /* synthetic */ FollowSubStagesDialog b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i2;
                FollowSubStagesDialog followSubStagesDialog = this.b;
                switch (i4) {
                    case 0:
                        FollowSubStagesViewModel followSubStagesViewModel = (FollowSubStagesViewModel) followSubStagesDialog.v.getValue();
                        Integer num = followSubStagesViewModel.f;
                        if (num != null) {
                            Map map = (tee) followSubStagesViewModel.k.d();
                            if (map == null) {
                                map = lm5.a;
                                map.getClass();
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                if (((Boolean) entry.getValue()).booleanValue()) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            ArrayList arrayList = new ArrayList(linkedHashMap.size());
                            Iterator it = linkedHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getKey()).intValue()));
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry2 : map.entrySet()) {
                                if (!((Boolean) entry2.getValue()).booleanValue()) {
                                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                            Iterator it2 = linkedHashMap2.entrySet().iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(Integer.valueOf(((Number) ((Map.Entry) it2.next()).getKey()).intValue()));
                            }
                            int i5 = 0;
                            if (Intrinsics.c(followSubStagesViewModel.j.d(), Boolean.TRUE)) {
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    Object next = it3.next();
                                    if (Intrinsics.c(followSubStagesViewModel.m.get(Integer.valueOf(((Number) next).intValue())), Boolean.FALSE)) {
                                        arrayList3.add(next);
                                    }
                                }
                                Iterator it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    nv.y(followSubStagesViewModel.i(), vu.UNMUTE_NOTIFICATION, xu.STAGE, ((Number) it4.next()).intValue(), wu.POPUP);
                                }
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it5 = arrayList2.iterator();
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    if (Intrinsics.c(followSubStagesViewModel.m.get(Integer.valueOf(((Number) next2).intValue())), Boolean.TRUE)) {
                                        arrayList4.add(next2);
                                    }
                                }
                                Iterator it6 = arrayList4.iterator();
                                while (it6.hasNext()) {
                                    nv.y(followSubStagesViewModel.i(), vu.MUTE_NOTIFICATION, xu.STAGE, ((Number) it6.next()).intValue(), wu.POPUP);
                                }
                                Context i6 = followSubStagesViewModel.i();
                                Pair[] pairArr = {new Pair("ACTION", "UPDATE_STAGES"), new Pair("STAGE_ID", num), new Pair("STAGE_IDS_TO_MUTE", CollectionsKt.R0(arrayList2)), new Pair("STAGE_IDS_TO_UN_MUTE", CollectionsKt.R0(arrayList))};
                                hpo hpoVar = new hpo(18);
                                while (i5 < 4) {
                                    Pair pair = pairArr[i5];
                                    hpoVar.B(pair.b, (String) pair.a);
                                    i5++;
                                }
                                md4 l = hpoVar.l();
                                vxd.h(i6).b("MuteStageWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(MuteStageWorker.class, l).a());
                            } else {
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it7 = arrayList.iterator();
                                while (it7.hasNext()) {
                                    Object next3 = it7.next();
                                    if (Intrinsics.c(followSubStagesViewModel.m.get(Integer.valueOf(((Number) next3).intValue())), Boolean.FALSE)) {
                                        arrayList5.add(next3);
                                    }
                                }
                                Iterator it8 = arrayList5.iterator();
                                while (it8.hasNext()) {
                                    nv.y(followSubStagesViewModel.i(), vu.ADD_NOTIFICATION, xu.STAGE, ((Number) it8.next()).intValue(), wu.POPUP);
                                }
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it9 = arrayList2.iterator();
                                while (it9.hasNext()) {
                                    Object next4 = it9.next();
                                    if (Intrinsics.c(followSubStagesViewModel.m.get(Integer.valueOf(((Number) next4).intValue())), Boolean.TRUE)) {
                                        arrayList6.add(next4);
                                    }
                                }
                                Iterator it10 = arrayList6.iterator();
                                while (it10.hasNext()) {
                                    nv.y(followSubStagesViewModel.i(), vu.REMOVE_NOTIFICATION, xu.STAGE, ((Number) it10.next()).intValue(), wu.POPUP);
                                }
                                Context i7 = followSubStagesViewModel.i();
                                Pair[] pairArr2 = {new Pair("ACTION", "ADD_STAGE_LIST"), new Pair("STAGE_IDS", CollectionsKt.R0(arrayList)), new Pair("WITH_SUB_STAGES", Boolean.FALSE)};
                                hpo hpoVar2 = new hpo(18);
                                for (int i8 = 0; i8 < 3; i8++) {
                                    Pair pair2 = pairArr2[i8];
                                    hpoVar2.B(pair2.b, (String) pair2.a);
                                }
                                md4 l2 = hpoVar2.l();
                                vxd.h(i7).b("StageWorker-".concat(mha.o(l2)), nf6.a, (ltd) vxd.g(StageWorker.class, l2).a());
                                Context i9 = followSubStagesViewModel.i();
                                Pair[] pairArr3 = {new Pair("ACTION", "REMOVE_STAGE_LIST"), new Pair("STAGE_IDS", CollectionsKt.R0(arrayList2))};
                                hpo hpoVar3 = new hpo(18);
                                while (i5 < 2) {
                                    Pair pair3 = pairArr3[i5];
                                    hpoVar3.B(pair3.b, (String) pair3.a);
                                    i5++;
                                }
                                md4 l3 = hpoVar3.l();
                                vxd.h(i9).b("StageWorker-".concat(mha.o(l3)), nf6.a, (ltd) vxd.g(StageWorker.class, l3).a());
                            }
                        }
                        dialogInterface.dismiss();
                        break;
                    default:
                        int i10 = NotificationSettingsActivity.O;
                        Context requireContext2 = followSubStagesDialog.requireContext();
                        requireContext2.getClass();
                        mx9.y(requireContext2);
                        break;
                }
            }
        });
        return create;
    }
}
