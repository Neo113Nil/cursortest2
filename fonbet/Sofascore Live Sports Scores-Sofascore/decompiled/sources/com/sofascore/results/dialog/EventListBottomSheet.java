package com.sofascore.results.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.EventListBottomSheet;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import defpackage.ay5;
import defpackage.ce4;
import defpackage.duf;
import defpackage.fi5;
import defpackage.joa;
import defpackage.otk;
import defpackage.qzh;
import defpackage.r1;
import defpackage.rq3;
import defpackage.s16;
import defpackage.t06;
import defpackage.u16;
import defpackage.un0;
import defpackage.w74;
import defpackage.wj0;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/dialog/EventListBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventListBottomSheet extends Hilt_EventListBottomSheet {
    public final otk B;
    public final joa C;
    public final joa D;
    public final joa E;
    public final joa F;
    public final joa G;
    public final joa H;
    public final boolean I;

    public EventListBottomSheet() {
        final int i = 2;
        t06 t06Var = new t06(this, 2);
        ysa ysaVar = ysa.c;
        final int i2 = 3;
        joa a = ypa.a(ysaVar, new t06(t06Var, 3));
        this.B = new otk(duf.a.getOrCreateKotlinClass(u16.class), new ay5(a, 9), new fi5(this, a, 8), new ay5(a, 10));
        final int i3 = 0;
        this.C = ypa.a(ysaVar, new Function0(this) { // from class: t16
            public final /* synthetic */ EventListBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                EventListBottomSheet eventListBottomSheet = this.b;
                switch (i4) {
                    case 0:
                        ArrayList<Integer> integerArrayList = eventListBottomSheet.requireArguments().getIntegerArrayList("EVENT_IDS_EXTRA");
                        return integerArrayList == null ? km5.a : integerArrayList;
                    case 1:
                        return eventListBottomSheet.requireArguments().getString("TITLE_EXTRA");
                    case 2:
                        int i5 = eventListBottomSheet.requireArguments().getInt("ANALYTICS_ID_EXTRA", -1);
                        Integer valueOf = Integer.valueOf(i5);
                        if (i5 != -1) {
                            return valueOf;
                        }
                        return null;
                    case 3:
                        return eventListBottomSheet.requireArguments().getString("ANALYTICS_NAME_EXTRA", "");
                    case 4:
                        Context requireContext = eventListBottomSheet.requireContext();
                        requireContext.getClass();
                        return new qzh(requireContext);
                    default:
                        Context requireContext2 = eventListBottomSheet.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(Integer.valueOf(R.drawable.check_back_later));
                        String string = eventListBottomSheet.getString(R.string.loading_error_title);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = eventListBottomSheet.getString(R.string.loading_error_body);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        final int i4 = 1;
        this.D = ypa.a(ysaVar, new Function0(this) { // from class: t16
            public final /* synthetic */ EventListBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i4;
                EventListBottomSheet eventListBottomSheet = this.b;
                switch (i42) {
                    case 0:
                        ArrayList<Integer> integerArrayList = eventListBottomSheet.requireArguments().getIntegerArrayList("EVENT_IDS_EXTRA");
                        return integerArrayList == null ? km5.a : integerArrayList;
                    case 1:
                        return eventListBottomSheet.requireArguments().getString("TITLE_EXTRA");
                    case 2:
                        int i5 = eventListBottomSheet.requireArguments().getInt("ANALYTICS_ID_EXTRA", -1);
                        Integer valueOf = Integer.valueOf(i5);
                        if (i5 != -1) {
                            return valueOf;
                        }
                        return null;
                    case 3:
                        return eventListBottomSheet.requireArguments().getString("ANALYTICS_NAME_EXTRA", "");
                    case 4:
                        Context requireContext = eventListBottomSheet.requireContext();
                        requireContext.getClass();
                        return new qzh(requireContext);
                    default:
                        Context requireContext2 = eventListBottomSheet.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(Integer.valueOf(R.drawable.check_back_later));
                        String string = eventListBottomSheet.getString(R.string.loading_error_title);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = eventListBottomSheet.getString(R.string.loading_error_body);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        this.E = ypa.a(ysaVar, new Function0(this) { // from class: t16
            public final /* synthetic */ EventListBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i;
                EventListBottomSheet eventListBottomSheet = this.b;
                switch (i42) {
                    case 0:
                        ArrayList<Integer> integerArrayList = eventListBottomSheet.requireArguments().getIntegerArrayList("EVENT_IDS_EXTRA");
                        return integerArrayList == null ? km5.a : integerArrayList;
                    case 1:
                        return eventListBottomSheet.requireArguments().getString("TITLE_EXTRA");
                    case 2:
                        int i5 = eventListBottomSheet.requireArguments().getInt("ANALYTICS_ID_EXTRA", -1);
                        Integer valueOf = Integer.valueOf(i5);
                        if (i5 != -1) {
                            return valueOf;
                        }
                        return null;
                    case 3:
                        return eventListBottomSheet.requireArguments().getString("ANALYTICS_NAME_EXTRA", "");
                    case 4:
                        Context requireContext = eventListBottomSheet.requireContext();
                        requireContext.getClass();
                        return new qzh(requireContext);
                    default:
                        Context requireContext2 = eventListBottomSheet.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(Integer.valueOf(R.drawable.check_back_later));
                        String string = eventListBottomSheet.getString(R.string.loading_error_title);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = eventListBottomSheet.getString(R.string.loading_error_body);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        this.F = ypa.a(ysaVar, new Function0(this) { // from class: t16
            public final /* synthetic */ EventListBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i2;
                EventListBottomSheet eventListBottomSheet = this.b;
                switch (i42) {
                    case 0:
                        ArrayList<Integer> integerArrayList = eventListBottomSheet.requireArguments().getIntegerArrayList("EVENT_IDS_EXTRA");
                        return integerArrayList == null ? km5.a : integerArrayList;
                    case 1:
                        return eventListBottomSheet.requireArguments().getString("TITLE_EXTRA");
                    case 2:
                        int i5 = eventListBottomSheet.requireArguments().getInt("ANALYTICS_ID_EXTRA", -1);
                        Integer valueOf = Integer.valueOf(i5);
                        if (i5 != -1) {
                            return valueOf;
                        }
                        return null;
                    case 3:
                        return eventListBottomSheet.requireArguments().getString("ANALYTICS_NAME_EXTRA", "");
                    case 4:
                        Context requireContext = eventListBottomSheet.requireContext();
                        requireContext.getClass();
                        return new qzh(requireContext);
                    default:
                        Context requireContext2 = eventListBottomSheet.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(Integer.valueOf(R.drawable.check_back_later));
                        String string = eventListBottomSheet.getString(R.string.loading_error_title);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = eventListBottomSheet.getString(R.string.loading_error_body);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        final int i5 = 4;
        this.G = ypa.a(ysaVar, new Function0(this) { // from class: t16
            public final /* synthetic */ EventListBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i5;
                EventListBottomSheet eventListBottomSheet = this.b;
                switch (i42) {
                    case 0:
                        ArrayList<Integer> integerArrayList = eventListBottomSheet.requireArguments().getIntegerArrayList("EVENT_IDS_EXTRA");
                        return integerArrayList == null ? km5.a : integerArrayList;
                    case 1:
                        return eventListBottomSheet.requireArguments().getString("TITLE_EXTRA");
                    case 2:
                        int i52 = eventListBottomSheet.requireArguments().getInt("ANALYTICS_ID_EXTRA", -1);
                        Integer valueOf = Integer.valueOf(i52);
                        if (i52 != -1) {
                            return valueOf;
                        }
                        return null;
                    case 3:
                        return eventListBottomSheet.requireArguments().getString("ANALYTICS_NAME_EXTRA", "");
                    case 4:
                        Context requireContext = eventListBottomSheet.requireContext();
                        requireContext.getClass();
                        return new qzh(requireContext);
                    default:
                        Context requireContext2 = eventListBottomSheet.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(Integer.valueOf(R.drawable.check_back_later));
                        String string = eventListBottomSheet.getString(R.string.loading_error_title);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = eventListBottomSheet.getString(R.string.loading_error_body);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        final int i6 = 5;
        this.H = ypa.a(ysaVar, new Function0(this) { // from class: t16
            public final /* synthetic */ EventListBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i6;
                EventListBottomSheet eventListBottomSheet = this.b;
                switch (i42) {
                    case 0:
                        ArrayList<Integer> integerArrayList = eventListBottomSheet.requireArguments().getIntegerArrayList("EVENT_IDS_EXTRA");
                        return integerArrayList == null ? km5.a : integerArrayList;
                    case 1:
                        return eventListBottomSheet.requireArguments().getString("TITLE_EXTRA");
                    case 2:
                        int i52 = eventListBottomSheet.requireArguments().getInt("ANALYTICS_ID_EXTRA", -1);
                        Integer valueOf = Integer.valueOf(i52);
                        if (i52 != -1) {
                            return valueOf;
                        }
                        return null;
                    case 3:
                        return eventListBottomSheet.requireArguments().getString("ANALYTICS_NAME_EXTRA", "");
                    case 4:
                        Context requireContext = eventListBottomSheet.requireContext();
                        requireContext.getClass();
                        return new qzh(requireContext);
                    default:
                        Context requireContext2 = eventListBottomSheet.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(Integer.valueOf(R.drawable.check_back_later));
                        String string = eventListBottomSheet.getString(R.string.loading_error_title);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = eventListBottomSheet.getString(R.string.loading_error_body);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        this.I = true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        w74 b = w74.b(layoutInflater, (FrameLayout) v().l);
        joa joaVar = this.G;
        qzh qzhVar = (qzh) joaVar.getValue();
        s16 s16Var = new s16(this, 0);
        qzhVar.getClass();
        qzhVar.a.d = s16Var;
        RecyclerView recyclerView = b.c;
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        z8e.b0(recyclerView, requireActivity, false, false, null, 22);
        s(recyclerView);
        recyclerView.setAdapter((qzh) joaVar.getValue());
        return b.b;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.t.a = (Integer) this.E.getValue();
        otk otkVar = this.B;
        u16 u16Var = (u16) otkVar.getValue();
        List list = (List) this.C.getValue();
        list.getClass();
        rq3 rq3Var = null;
        xw3.L(un0.z(u16Var), null, null, new ce4(u16Var, list, rq3Var, 15), 3);
        z8e.y(this, new wj0(((u16) otkVar.getValue()).g, 3), new r1(this, rq3Var, 21));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        String str = (String) this.F.getValue();
        str.getClass();
        return str;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getB() {
        return this.I;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return (String) this.D.getValue();
    }
}
