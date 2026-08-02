package com.sofascore.results.player.statistics.career.modal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.slider.RangeSlider;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import com.sofascore.results.view.SofaTextInputLayout;
import com.unity3d.services.UnityAdsConstants;
import defpackage.al2;
import defpackage.bl2;
import defpackage.dk2;
import defpackage.dl2;
import defpackage.fzg;
import defpackage.joa;
import defpackage.jpe;
import defpackage.k13;
import defpackage.nq8;
import defpackage.rk2;
import defpackage.tba;
import defpackage.tk2;
import defpackage.uk2;
import defpackage.vk2;
import defpackage.vxd;
import defpackage.w1l;
import defpackage.wzb;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z3f;
import defpackage.zl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/sofascore/results/player/statistics/career/modal/CareerStatsFilterModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "uk2", "com/sofascore/results/player/statistics/career/modal/b", "vk2", "CareerStatsFilterData", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CareerStatsFilterModal extends BaseModalBottomSheetDialog {
    public final joa A;
    public final joa B;
    public final joa C;
    public Team D;
    public vk2 E;
    public fzg F;
    public zl w;
    public z3f x;
    public final joa y;
    public final joa z;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/player/statistics/career/modal/CareerStatsFilterModal$CareerStatsFilterData;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CareerStatsFilterData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CareerStatsFilterData> CREATOR = new a();
        public Team a;
        public vk2 b;
        public final fzg c;
        public Integer d;
        public Integer e;

        public CareerStatsFilterData(Team team, vk2 vk2Var, fzg fzgVar, Integer num, Integer num2) {
            vk2Var.getClass();
            fzgVar.getClass();
            this.a = team;
            this.b = vk2Var;
            this.c = fzgVar;
            this.d = num;
            this.e = num2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CareerStatsFilterData)) {
                return false;
            }
            CareerStatsFilterData careerStatsFilterData = (CareerStatsFilterData) obj;
            return Intrinsics.c(this.a, careerStatsFilterData.a) && this.b == careerStatsFilterData.b && this.c == careerStatsFilterData.c && Intrinsics.c(this.d, careerStatsFilterData.d) && Intrinsics.c(this.e, careerStatsFilterData.e);
        }

        public final int hashCode() {
            Team team = this.a;
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + ((team == null ? 0 : team.hashCode()) * 31)) * 31)) * 31;
            Integer num = this.d;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.e;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            Team team = this.a;
            vk2 vk2Var = this.b;
            Integer num = this.d;
            Integer num2 = this.e;
            StringBuilder sb = new StringBuilder("CareerStatsFilterData(team=");
            sb.append(team);
            sb.append(", homeAwayTotalMode=");
            sb.append(vk2Var);
            sb.append(", statisticsViewMode=");
            sb.append(this.c);
            sb.append(", yearFrom=");
            sb.append(num);
            sb.append(", yearTo=");
            return vxd.n(sb, num2, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.a);
            parcel.writeString(this.b.name());
            parcel.writeString(this.c.name());
            Integer num = this.d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                w1l.u(parcel, 1, num);
            }
            Integer num2 = this.e;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                w1l.u(parcel, 1, num2);
            }
        }
    }

    public CareerStatsFilterModal() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: qk2
            public final /* synthetic */ CareerStatsFilterModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CareerStatsFilterModal careerStatsFilterModal = this.b;
                switch (i2) {
                    case 0:
                        return careerStatsFilterModal.requireArguments().getString("sport_slug", "");
                    case 1:
                        Bundle requireArguments = careerStatsFilterModal.requireArguments();
                        requireArguments.getClass();
                        Parcelable parcelable = (Parcelable) gz8.K(requireArguments, "stored_filter_data", CareerStatsFilterModal.CareerStatsFilterData.class);
                        if (parcelable != null) {
                            return (CareerStatsFilterModal.CareerStatsFilterData) parcelable;
                        }
                        a70.p("Parcelable stored_filter_data not found");
                        return null;
                    case 2:
                        Bundle requireArguments2 = careerStatsFilterModal.requireArguments();
                        requireArguments2.getClass();
                        Parcelable parcelable2 = (Parcelable) gz8.K(requireArguments2, "initial_filter_data", CareerStatsFilterModal.CareerStatsFilterData.class);
                        if (parcelable2 != null) {
                            return (CareerStatsFilterModal.CareerStatsFilterData) parcelable2;
                        }
                        a70.p("Parcelable initial_filter_data not found");
                        return null;
                    case 3:
                        Bundle requireArguments3 = careerStatsFilterModal.requireArguments();
                        requireArguments3.getClass();
                        Serializable M = gz8.M(requireArguments3, "available_teams", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable available_teams not found");
                        return null;
                    default:
                        ArrayList<Integer> integerArrayList = careerStatsFilterModal.requireArguments().getIntegerArrayList("available_years");
                        return integerArrayList != null ? integerArrayList : km5.a;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.y = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.z = ypa.a(ysaVar, new Function0(this) { // from class: qk2
            public final /* synthetic */ CareerStatsFilterModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CareerStatsFilterModal careerStatsFilterModal = this.b;
                switch (i22) {
                    case 0:
                        return careerStatsFilterModal.requireArguments().getString("sport_slug", "");
                    case 1:
                        Bundle requireArguments = careerStatsFilterModal.requireArguments();
                        requireArguments.getClass();
                        Parcelable parcelable = (Parcelable) gz8.K(requireArguments, "stored_filter_data", CareerStatsFilterModal.CareerStatsFilterData.class);
                        if (parcelable != null) {
                            return (CareerStatsFilterModal.CareerStatsFilterData) parcelable;
                        }
                        a70.p("Parcelable stored_filter_data not found");
                        return null;
                    case 2:
                        Bundle requireArguments2 = careerStatsFilterModal.requireArguments();
                        requireArguments2.getClass();
                        Parcelable parcelable2 = (Parcelable) gz8.K(requireArguments2, "initial_filter_data", CareerStatsFilterModal.CareerStatsFilterData.class);
                        if (parcelable2 != null) {
                            return (CareerStatsFilterModal.CareerStatsFilterData) parcelable2;
                        }
                        a70.p("Parcelable initial_filter_data not found");
                        return null;
                    case 3:
                        Bundle requireArguments3 = careerStatsFilterModal.requireArguments();
                        requireArguments3.getClass();
                        Serializable M = gz8.M(requireArguments3, "available_teams", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable available_teams not found");
                        return null;
                    default:
                        ArrayList<Integer> integerArrayList = careerStatsFilterModal.requireArguments().getIntegerArrayList("available_years");
                        return integerArrayList != null ? integerArrayList : km5.a;
                }
            }
        });
        final int i3 = 2;
        this.A = ypa.a(ysaVar, new Function0(this) { // from class: qk2
            public final /* synthetic */ CareerStatsFilterModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CareerStatsFilterModal careerStatsFilterModal = this.b;
                switch (i22) {
                    case 0:
                        return careerStatsFilterModal.requireArguments().getString("sport_slug", "");
                    case 1:
                        Bundle requireArguments = careerStatsFilterModal.requireArguments();
                        requireArguments.getClass();
                        Parcelable parcelable = (Parcelable) gz8.K(requireArguments, "stored_filter_data", CareerStatsFilterModal.CareerStatsFilterData.class);
                        if (parcelable != null) {
                            return (CareerStatsFilterModal.CareerStatsFilterData) parcelable;
                        }
                        a70.p("Parcelable stored_filter_data not found");
                        return null;
                    case 2:
                        Bundle requireArguments2 = careerStatsFilterModal.requireArguments();
                        requireArguments2.getClass();
                        Parcelable parcelable2 = (Parcelable) gz8.K(requireArguments2, "initial_filter_data", CareerStatsFilterModal.CareerStatsFilterData.class);
                        if (parcelable2 != null) {
                            return (CareerStatsFilterModal.CareerStatsFilterData) parcelable2;
                        }
                        a70.p("Parcelable initial_filter_data not found");
                        return null;
                    case 3:
                        Bundle requireArguments3 = careerStatsFilterModal.requireArguments();
                        requireArguments3.getClass();
                        Serializable M = gz8.M(requireArguments3, "available_teams", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable available_teams not found");
                        return null;
                    default:
                        ArrayList<Integer> integerArrayList = careerStatsFilterModal.requireArguments().getIntegerArrayList("available_years");
                        return integerArrayList != null ? integerArrayList : km5.a;
                }
            }
        });
        final int i4 = 3;
        this.B = ypa.a(ysaVar, new Function0(this) { // from class: qk2
            public final /* synthetic */ CareerStatsFilterModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                CareerStatsFilterModal careerStatsFilterModal = this.b;
                switch (i22) {
                    case 0:
                        return careerStatsFilterModal.requireArguments().getString("sport_slug", "");
                    case 1:
                        Bundle requireArguments = careerStatsFilterModal.requireArguments();
                        requireArguments.getClass();
                        Parcelable parcelable = (Parcelable) gz8.K(requireArguments, "stored_filter_data", CareerStatsFilterModal.CareerStatsFilterData.class);
                        if (parcelable != null) {
                            return (CareerStatsFilterModal.CareerStatsFilterData) parcelable;
                        }
                        a70.p("Parcelable stored_filter_data not found");
                        return null;
                    case 2:
                        Bundle requireArguments2 = careerStatsFilterModal.requireArguments();
                        requireArguments2.getClass();
                        Parcelable parcelable2 = (Parcelable) gz8.K(requireArguments2, "initial_filter_data", CareerStatsFilterModal.CareerStatsFilterData.class);
                        if (parcelable2 != null) {
                            return (CareerStatsFilterModal.CareerStatsFilterData) parcelable2;
                        }
                        a70.p("Parcelable initial_filter_data not found");
                        return null;
                    case 3:
                        Bundle requireArguments3 = careerStatsFilterModal.requireArguments();
                        requireArguments3.getClass();
                        Serializable M = gz8.M(requireArguments3, "available_teams", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable available_teams not found");
                        return null;
                    default:
                        ArrayList<Integer> integerArrayList = careerStatsFilterModal.requireArguments().getIntegerArrayList("available_years");
                        return integerArrayList != null ? integerArrayList : km5.a;
                }
            }
        });
        final int i5 = 4;
        this.C = ypa.a(ysaVar, new Function0(this) { // from class: qk2
            public final /* synthetic */ CareerStatsFilterModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CareerStatsFilterModal careerStatsFilterModal = this.b;
                switch (i22) {
                    case 0:
                        return careerStatsFilterModal.requireArguments().getString("sport_slug", "");
                    case 1:
                        Bundle requireArguments = careerStatsFilterModal.requireArguments();
                        requireArguments.getClass();
                        Parcelable parcelable = (Parcelable) gz8.K(requireArguments, "stored_filter_data", CareerStatsFilterModal.CareerStatsFilterData.class);
                        if (parcelable != null) {
                            return (CareerStatsFilterModal.CareerStatsFilterData) parcelable;
                        }
                        a70.p("Parcelable stored_filter_data not found");
                        return null;
                    case 2:
                        Bundle requireArguments2 = careerStatsFilterModal.requireArguments();
                        requireArguments2.getClass();
                        Parcelable parcelable2 = (Parcelable) gz8.K(requireArguments2, "initial_filter_data", CareerStatsFilterModal.CareerStatsFilterData.class);
                        if (parcelable2 != null) {
                            return (CareerStatsFilterModal.CareerStatsFilterData) parcelable2;
                        }
                        a70.p("Parcelable initial_filter_data not found");
                        return null;
                    case 3:
                        Bundle requireArguments3 = careerStatsFilterModal.requireArguments();
                        requireArguments3.getClass();
                        Serializable M = gz8.M(requireArguments3, "available_teams", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable available_teams not found");
                        return null;
                    default:
                        ArrayList<Integer> integerArrayList = careerStatsFilterModal.requireArguments().getIntegerArrayList("available_years");
                        return integerArrayList != null ? integerArrayList : km5.a;
                }
            }
        });
        this.E = vk2.c;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View B(LayoutInflater layoutInflater) {
        z3f d = z3f.d(layoutInflater, (FrameLayout) v().k);
        this.x = d;
        ((Button) d.d).setText(R.string.reset_filter_button);
        z3f z3fVar = this.x;
        if (z3fVar == null) {
            Intrinsics.i("modalFooter");
            throw null;
        }
        ((Button) z3fVar.d).setOnClickListener(new rk2(this, 1));
        z3f z3fVar2 = this.x;
        if (z3fVar2 == null) {
            Intrinsics.i("modalFooter");
            throw null;
        }
        ((Button) z3fVar2.c).setOnClickListener(new rk2(this, 2));
        z3f z3fVar3 = this.x;
        if (z3fVar3 == null) {
            Intrinsics.i("modalFooter");
            throw null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) z3fVar3.b;
        constraintLayout.getClass();
        return constraintLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.career_stats_modal_layout, (ViewGroup) v().l, false);
        int i2 = R.id.career_stats_filter_modal_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.career_stats_filter_modal_container, inflate);
        if (constraintLayout != null) {
            i2 = R.id.match_type_filter;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) nq8.B(R.id.match_type_filter, inflate);
            if (materialAutoCompleteTextView != null) {
                i2 = R.id.match_type_input;
                SofaTextInputLayout sofaTextInputLayout = (SofaTextInputLayout) nq8.B(R.id.match_type_input, inflate);
                if (sofaTextInputLayout != null) {
                    i2 = R.id.per_mode_subtitle;
                    View B = nq8.B(R.id.per_mode_subtitle, inflate);
                    if (B != null) {
                        dk2 b = dk2.b(B);
                        i2 = R.id.radio_per_game;
                        RadioButton radioButton = (RadioButton) nq8.B(R.id.radio_per_game, inflate);
                        if (radioButton != null) {
                            i2 = R.id.radio_totals;
                            RadioButton radioButton2 = (RadioButton) nq8.B(R.id.radio_totals, inflate);
                            if (radioButton2 != null) {
                                i2 = R.id.statistics_type_group;
                                Group group = (Group) nq8.B(R.id.statistics_type_group, inflate);
                                if (group != null) {
                                    i2 = R.id.statistics_type_radio_group;
                                    if (((RadioGroup) nq8.B(R.id.statistics_type_radio_group, inflate)) != null) {
                                        i2 = R.id.team_filter;
                                        MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) nq8.B(R.id.team_filter, inflate);
                                        if (materialAutoCompleteTextView2 != null) {
                                            i2 = R.id.team_input;
                                            SofaTextInputLayout sofaTextInputLayout2 = (SofaTextInputLayout) nq8.B(R.id.team_input, inflate);
                                            if (sofaTextInputLayout2 != null) {
                                                i2 = R.id.year_range_slider;
                                                RangeSlider rangeSlider = (RangeSlider) nq8.B(R.id.year_range_slider, inflate);
                                                if (rangeSlider != null) {
                                                    i2 = R.id.year_range_subtitle;
                                                    View B2 = nq8.B(R.id.year_range_subtitle, inflate);
                                                    if (B2 != null) {
                                                        dk2 b2 = dk2.b(B2);
                                                        i2 = R.id.year_range_text;
                                                        TextView textView = (TextView) nq8.B(R.id.year_range_text, inflate);
                                                        if (textView != null) {
                                                            this.w = new zl((NestedScrollView) inflate, constraintLayout, materialAutoCompleteTextView, sofaTextInputLayout, b, radioButton, radioButton2, group, materialAutoCompleteTextView2, sofaTextInputLayout2, rangeSlider, b2, textView);
                                                            NestedScrollView nestedScrollView = (NestedScrollView) H().f;
                                                            nestedScrollView.getClass();
                                                            r(nestedScrollView);
                                                            final int i3 = 1;
                                                            if (G().d == null || G().e == null || F().isEmpty()) {
                                                                H().g.setVisibility(8);
                                                                ((dk2) H().n).b.setVisibility(8);
                                                                ((RangeSlider) H().m).setVisibility(8);
                                                            } else {
                                                                ((dk2) H().n).c.setText(getString(R.string.filter_by_seasons));
                                                                ((RangeSlider) H().m).m.add(new tk2(this, i));
                                                                ((RangeSlider) H().m).n.add(new uk2());
                                                                Integer num = K().d;
                                                                if (num != null) {
                                                                    int intValue = num.intValue();
                                                                    Integer num2 = K().e;
                                                                    if (num2 != null) {
                                                                        int intValue2 = num2.intValue();
                                                                        RangeSlider rangeSlider2 = (RangeSlider) H().m;
                                                                        rangeSlider2.setValueFrom(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                                                        rangeSlider2.setValueTo(F().size() - 1);
                                                                        List F = F();
                                                                        Integer num3 = G().d;
                                                                        if (num3 != null) {
                                                                            intValue = num3.intValue();
                                                                        }
                                                                        int indexOf = F.indexOf(Integer.valueOf(intValue));
                                                                        if (indexOf < 0) {
                                                                            indexOf = 0;
                                                                        }
                                                                        Float valueOf = Float.valueOf(indexOf);
                                                                        List F2 = F();
                                                                        Integer num4 = G().e;
                                                                        if (num4 != null) {
                                                                            intValue2 = num4.intValue();
                                                                        }
                                                                        int indexOf2 = F2.indexOf(Integer.valueOf(intValue2));
                                                                        Integer valueOf2 = Integer.valueOf(indexOf2);
                                                                        if (indexOf2 == -1) {
                                                                            valueOf2 = null;
                                                                        }
                                                                        rangeSlider2.setValues(kotlin.collections.b.e(valueOf, Float.valueOf(valueOf2 != null ? valueOf2.intValue() : F().size() - 1)));
                                                                    }
                                                                }
                                                            }
                                                            Context requireContext = requireContext();
                                                            requireContext.getClass();
                                                            dl2 dl2Var = new dl2(requireContext);
                                                            joa joaVar = this.B;
                                                            List<Team> list = (List) joaVar.getValue();
                                                            list.getClass();
                                                            ArrayList arrayList = dl2Var.a;
                                                            arrayList.clear();
                                                            Context context = dl2Var.getContext();
                                                            context.getClass();
                                                            String string = context.getString(R.string.all_teams);
                                                            string.getClass();
                                                            arrayList.add(new bl2(null, string));
                                                            ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                                                            for (Team team : list) {
                                                                Context context2 = dl2Var.getContext();
                                                                context2.getClass();
                                                                team.getClass();
                                                                arrayList2.add(new bl2(Integer.valueOf(team.getId()), tba.p(context2, team)));
                                                            }
                                                            arrayList.addAll(arrayList2);
                                                            dl2Var.notifyDataSetChanged();
                                                            ((MaterialAutoCompleteTextView) H().e).setAdapter(dl2Var);
                                                            ((MaterialAutoCompleteTextView) H().e).setOnItemClickListener(new AdapterView.OnItemClickListener(this) { // from class: sk2
                                                                public final /* synthetic */ CareerStatsFilterModal b;

                                                                {
                                                                    this.b = this;
                                                                }

                                                                @Override // android.widget.AdapterView.OnItemClickListener
                                                                public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
                                                                    Object obj;
                                                                    Adapter adapter;
                                                                    Adapter adapter2;
                                                                    int i5 = i;
                                                                    CareerStatsFilterModal careerStatsFilterModal = this.b;
                                                                    switch (i5) {
                                                                        case 0:
                                                                            Object item = (adapterView == null || (adapter = adapterView.getAdapter()) == null) ? null : adapter.getItem(i4);
                                                                            bl2 bl2Var = item instanceof bl2 ? (bl2) item : null;
                                                                            if (bl2Var != null) {
                                                                                ((MaterialAutoCompleteTextView) careerStatsFilterModal.H().e).setText(bl2Var.b);
                                                                                Iterator it = ((List) careerStatsFilterModal.B.getValue()).iterator();
                                                                                while (true) {
                                                                                    if (it.hasNext()) {
                                                                                        obj = it.next();
                                                                                        int id = ((Team) obj).getId();
                                                                                        Integer num5 = bl2Var.a;
                                                                                        if (num5 != null && id == num5.intValue()) {
                                                                                        }
                                                                                    } else {
                                                                                        obj = null;
                                                                                    }
                                                                                }
                                                                                Team team2 = (Team) obj;
                                                                                if (team2 == null) {
                                                                                    careerStatsFilterModal.D = null;
                                                                                    careerStatsFilterModal.M();
                                                                                    Adapter adapter3 = adapterView.getAdapter();
                                                                                    dl2 dl2Var2 = adapter3 instanceof dl2 ? (dl2) adapter3 : null;
                                                                                    if (dl2Var2 != null) {
                                                                                        dl2Var2.b = 0;
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    careerStatsFilterModal.D = team2;
                                                                                    careerStatsFilterModal.M();
                                                                                    Adapter adapter4 = adapterView.getAdapter();
                                                                                    dl2 dl2Var3 = adapter4 instanceof dl2 ? (dl2) adapter4 : null;
                                                                                    if (dl2Var3 != null) {
                                                                                        dl2Var3.b = i4;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            Object item2 = (adapterView == null || (adapter2 = adapterView.getAdapter()) == null) ? null : adapter2.getItem(i4);
                                                                            vk2 vk2Var = item2 instanceof vk2 ? (vk2) item2 : null;
                                                                            if (vk2Var != null) {
                                                                                ((MaterialAutoCompleteTextView) careerStatsFilterModal.H().j).setText(careerStatsFilterModal.getString(vk2Var.b));
                                                                                careerStatsFilterModal.E = vk2Var;
                                                                                careerStatsFilterModal.M();
                                                                                Adapter adapter5 = adapterView.getAdapter();
                                                                                al2 al2Var = adapter5 instanceof al2 ? (al2) adapter5 : null;
                                                                                if (al2Var != null) {
                                                                                    al2Var.b = vk2.e.indexOf(vk2Var);
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            this.D = G().a;
                                                            M();
                                                            dl2Var.b = CollectionsKt.c0((List) joaVar.getValue(), G().a) + 1;
                                                            Team team2 = this.D;
                                                            if (team2 != null) {
                                                                MaterialAutoCompleteTextView materialAutoCompleteTextView3 = (MaterialAutoCompleteTextView) H().e;
                                                                Context requireContext2 = requireContext();
                                                                requireContext2.getClass();
                                                                materialAutoCompleteTextView3.setText(tba.p(requireContext2, team2));
                                                            } else {
                                                                ((MaterialAutoCompleteTextView) H().e).setText(getString(R.string.all_teams));
                                                            }
                                                            if (((List) joaVar.getValue()).size() <= 1) {
                                                                ((SofaTextInputLayout) H().h).setEnabled(false);
                                                                ((SofaTextInputLayout) H().h).setEndIconVisible(false);
                                                                ((MaterialAutoCompleteTextView) H().e).setAlpha(0.6f);
                                                            }
                                                            Object value = this.y.getValue();
                                                            value.getClass();
                                                            if (((String) value).equals(Sports.FOOTBALL)) {
                                                                Context requireContext3 = requireContext();
                                                                requireContext3.getClass();
                                                                al2 al2Var = new al2(requireContext3);
                                                                ((MaterialAutoCompleteTextView) H().j).setAdapter(al2Var);
                                                                ((MaterialAutoCompleteTextView) H().j).setOnItemClickListener(new AdapterView.OnItemClickListener(this) { // from class: sk2
                                                                    public final /* synthetic */ CareerStatsFilterModal b;

                                                                    {
                                                                        this.b = this;
                                                                    }

                                                                    @Override // android.widget.AdapterView.OnItemClickListener
                                                                    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
                                                                        Object obj;
                                                                        Adapter adapter;
                                                                        Adapter adapter2;
                                                                        int i5 = i3;
                                                                        CareerStatsFilterModal careerStatsFilterModal = this.b;
                                                                        switch (i5) {
                                                                            case 0:
                                                                                Object item = (adapterView == null || (adapter = adapterView.getAdapter()) == null) ? null : adapter.getItem(i4);
                                                                                bl2 bl2Var = item instanceof bl2 ? (bl2) item : null;
                                                                                if (bl2Var != null) {
                                                                                    ((MaterialAutoCompleteTextView) careerStatsFilterModal.H().e).setText(bl2Var.b);
                                                                                    Iterator it = ((List) careerStatsFilterModal.B.getValue()).iterator();
                                                                                    while (true) {
                                                                                        if (it.hasNext()) {
                                                                                            obj = it.next();
                                                                                            int id = ((Team) obj).getId();
                                                                                            Integer num5 = bl2Var.a;
                                                                                            if (num5 != null && id == num5.intValue()) {
                                                                                            }
                                                                                        } else {
                                                                                            obj = null;
                                                                                        }
                                                                                    }
                                                                                    Team team22 = (Team) obj;
                                                                                    if (team22 == null) {
                                                                                        careerStatsFilterModal.D = null;
                                                                                        careerStatsFilterModal.M();
                                                                                        Adapter adapter3 = adapterView.getAdapter();
                                                                                        dl2 dl2Var2 = adapter3 instanceof dl2 ? (dl2) adapter3 : null;
                                                                                        if (dl2Var2 != null) {
                                                                                            dl2Var2.b = 0;
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        careerStatsFilterModal.D = team22;
                                                                                        careerStatsFilterModal.M();
                                                                                        Adapter adapter4 = adapterView.getAdapter();
                                                                                        dl2 dl2Var3 = adapter4 instanceof dl2 ? (dl2) adapter4 : null;
                                                                                        if (dl2Var3 != null) {
                                                                                            dl2Var3.b = i4;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                Object item2 = (adapterView == null || (adapter2 = adapterView.getAdapter()) == null) ? null : adapter2.getItem(i4);
                                                                                vk2 vk2Var = item2 instanceof vk2 ? (vk2) item2 : null;
                                                                                if (vk2Var != null) {
                                                                                    ((MaterialAutoCompleteTextView) careerStatsFilterModal.H().j).setText(careerStatsFilterModal.getString(vk2Var.b));
                                                                                    careerStatsFilterModal.E = vk2Var;
                                                                                    careerStatsFilterModal.M();
                                                                                    Adapter adapter5 = adapterView.getAdapter();
                                                                                    al2 al2Var2 = adapter5 instanceof al2 ? (al2) adapter5 : null;
                                                                                    if (al2Var2 != null) {
                                                                                        al2Var2.b = vk2.e.indexOf(vk2Var);
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                });
                                                                this.E = G().b;
                                                                M();
                                                                al2Var.b = vk2.e.indexOf(G().b);
                                                                ((MaterialAutoCompleteTextView) H().j).setText(getString(this.E.b));
                                                            } else {
                                                                ((SofaTextInputLayout) H().k).setVisibility(8);
                                                            }
                                                            L();
                                                            ((ConstraintLayout) H().b).setOnClickListener(new rk2(this, 3));
                                                            L();
                                                            NestedScrollView nestedScrollView2 = (NestedScrollView) H().f;
                                                            nestedScrollView2.getClass();
                                                            return nestedScrollView2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    public final List F() {
        return (List) this.C.getValue();
    }

    public final CareerStatsFilterData G() {
        return (CareerStatsFilterData) this.A.getValue();
    }

    public final zl H() {
        zl zlVar = this.w;
        if (zlVar != null) {
            return zlVar;
        }
        Intrinsics.i("modalBinding");
        throw null;
    }

    public final fzg I() {
        fzg fzgVar = this.F;
        if (fzgVar != null) {
            return fzgVar;
        }
        jpe jpeVar = fzg.c;
        Object value = this.y.getValue();
        value.getClass();
        jpeVar.getClass();
        return jpe.a((String) value);
    }

    public final CareerStatsFilterData K() {
        return (CareerStatsFilterData) this.z.getValue();
    }

    public final void L() {
        joa joaVar = this.y;
        Object value = joaVar.getValue();
        value.getClass();
        if (((String) value).equals(Sports.BASEBALL)) {
            ((Group) H().d).setVisibility(8);
            return;
        }
        ((dk2) H().i).c.setText(getString(R.string.filter_per_mode));
        P(G().c);
        ((RadioButton) H().c).setOnClickListener(new rk2(this, 4));
        RadioButton radioButton = (RadioButton) H().l;
        Object value2 = joaVar.getValue();
        value2.getClass();
        radioButton.setText(((String) value2).equals(Sports.FOOTBALL) ? R.string.filter_per_90_minutes : R.string.basketball_per_game_stats_title);
        ((RadioButton) H().l).setOnClickListener(new rk2(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r1 != r2.intValue()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r1 != r3.intValue()) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        boolean z;
        z3f z3fVar = this.x;
        if (z3fVar == null) {
            Intrinsics.i("modalFooter");
            throw null;
        }
        Button button = (Button) z3fVar.d;
        if (this.D == null && K().c == I() && (((MaterialAutoCompleteTextView) H().j).getVisibility() != 0 || this.E == vk2.c)) {
            if (!F().isEmpty()) {
                int N = N();
                Integer num = K().d;
                if (num != null) {
                }
            }
            if (!F().isEmpty()) {
                int O = O();
                Integer num2 = K().e;
                if (num2 != null) {
                }
            }
            z = false;
            button.setEnabled(z);
        }
        z = true;
        button.setEnabled(z);
    }

    public final int N() {
        Float f = ((RangeSlider) H().m).getValues().get(0);
        f.getClass();
        return ((Number) F().get(wzb.b(f.floatValue()))).intValue();
    }

    public final int O() {
        List<Float> values = ((RangeSlider) H().m).getValues();
        values.getClass();
        Float f = 1 < values.size() ? values.get(1) : values.get(0);
        f.getClass();
        return ((Number) F().get(wzb.b(f.floatValue()))).intValue();
    }

    public final void P(fzg fzgVar) {
        this.F = fzgVar;
        ((RadioButton) H().c).setChecked(I() == fzg.f);
        ((RadioButton) H().l).setChecked(I() == fzg.e);
        M();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        parent.getClass();
        BottomSheetBehavior.C((View) parent).M(3);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "CareerFilterModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.filter_by);
        string.getClass();
        return string;
    }
}
