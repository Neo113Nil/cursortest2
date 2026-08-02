package com.sofascore.results.event.commentary;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.event.commentary.CommentaryGoalModal;
import defpackage.b43;
import defpackage.g43;
import defpackage.joa;
import defpackage.mqi;
import defpackage.w74;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\u0007\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/sofascore/results/event/commentary/CommentaryGoalModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "dy0", "f43", "b43", "wh", "vh", "g43", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommentaryGoalModal extends BaseModalBottomSheetDialog {
    public final mqi A;
    public final mqi B;
    public final boolean C;
    public final joa w;
    public final joa x;
    public final joa y;
    public final joa z;

    public CommentaryGoalModal() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: a43
            public final /* synthetic */ CommentaryGoalModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CommentaryGoalModal commentaryGoalModal = this.b;
                switch (i2) {
                    case 0:
                        Context requireContext = commentaryGoalModal.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.s(2, requireContext));
                    case 1:
                        Context requireContext2 = commentaryGoalModal.requireContext();
                        requireContext2.getClass();
                        return Integer.valueOf(ao2.s(16, requireContext2));
                    case 2:
                        Context requireContext3 = commentaryGoalModal.requireContext();
                        requireContext3.getClass();
                        return Integer.valueOf(ao2.s(24, requireContext3));
                    case 3:
                        joa joaVar = commentaryGoalModal.y;
                        b43 b43Var = new b43(commentaryGoalModal);
                        if (commentaryGoalModal.F().h) {
                            b43Var.r(new c43(R.drawable.ic_football_glove, R.string.football_goalkeeper_save));
                        }
                        if (commentaryGoalModal.F().i) {
                            b43Var.r(new c43(R.drawable.ic_football_woodwork, R.string.football_hit_woodwork));
                        }
                        if (!commentaryGoalModal.F().a.isEmpty()) {
                            String string = commentaryGoalModal.getString(R.string.goal_animation_key_participants);
                            string.getClass();
                            b43Var.r(new d43(string, b43Var.getItemCount() > 0 ? ((Number) joaVar.getValue()).intValue() : ((Number) commentaryGoalModal.x.getValue()).intValue()));
                            Iterator it = commentaryGoalModal.F().a.iterator();
                            while (it.hasNext()) {
                                Player player = (Player) it.next();
                                int id = player.getId();
                                Integer num = commentaryGoalModal.F().c;
                                boolean z = num != null && id == num.intValue();
                                int i3 = (z && commentaryGoalModal.F().j) ? commentaryGoalModal.F().g : commentaryGoalModal.F().f;
                                Integer num2 = z ? commentaryGoalModal.F().e : null;
                                int id2 = player.getId();
                                Integer num3 = commentaryGoalModal.F().d;
                                b43Var.r(new e43(i3, player, num2, z, num3 != null && id2 == num3.intValue(), commentaryGoalModal.F().j));
                            }
                        }
                        Player player2 = commentaryGoalModal.F().b;
                        if (player2 != null) {
                            Context requireContext4 = commentaryGoalModal.requireContext();
                            requireContext4.getClass();
                            b43Var.r(new d43(hkg.Q(requireContext4, R.string.goalkeeper, (Gender) commentaryGoalModal.B.getValue(), new Object[0]), ((Number) joaVar.getValue()).intValue()));
                            b43Var.r(new e43(commentaryGoalModal.F().g, player2, null, false, false, false));
                        }
                        b43Var.a.d = new kr1(commentaryGoalModal, 20);
                        return b43Var;
                    case 4:
                        Bundle requireArguments = commentaryGoalModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "goalInfo", g43.class);
                        if (M != null) {
                            return (g43) M;
                        }
                        a70.p("Serializable goalInfo not found");
                        return null;
                    default:
                        Bundle requireArguments2 = commentaryGoalModal.requireArguments();
                        requireArguments2.getClass();
                        return (Gender) gz8.M(requireArguments2, "GENDER", Gender.class);
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.w = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: a43
            public final /* synthetic */ CommentaryGoalModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CommentaryGoalModal commentaryGoalModal = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = commentaryGoalModal.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.s(2, requireContext));
                    case 1:
                        Context requireContext2 = commentaryGoalModal.requireContext();
                        requireContext2.getClass();
                        return Integer.valueOf(ao2.s(16, requireContext2));
                    case 2:
                        Context requireContext3 = commentaryGoalModal.requireContext();
                        requireContext3.getClass();
                        return Integer.valueOf(ao2.s(24, requireContext3));
                    case 3:
                        joa joaVar = commentaryGoalModal.y;
                        b43 b43Var = new b43(commentaryGoalModal);
                        if (commentaryGoalModal.F().h) {
                            b43Var.r(new c43(R.drawable.ic_football_glove, R.string.football_goalkeeper_save));
                        }
                        if (commentaryGoalModal.F().i) {
                            b43Var.r(new c43(R.drawable.ic_football_woodwork, R.string.football_hit_woodwork));
                        }
                        if (!commentaryGoalModal.F().a.isEmpty()) {
                            String string = commentaryGoalModal.getString(R.string.goal_animation_key_participants);
                            string.getClass();
                            b43Var.r(new d43(string, b43Var.getItemCount() > 0 ? ((Number) joaVar.getValue()).intValue() : ((Number) commentaryGoalModal.x.getValue()).intValue()));
                            Iterator it = commentaryGoalModal.F().a.iterator();
                            while (it.hasNext()) {
                                Player player = (Player) it.next();
                                int id = player.getId();
                                Integer num = commentaryGoalModal.F().c;
                                boolean z = num != null && id == num.intValue();
                                int i3 = (z && commentaryGoalModal.F().j) ? commentaryGoalModal.F().g : commentaryGoalModal.F().f;
                                Integer num2 = z ? commentaryGoalModal.F().e : null;
                                int id2 = player.getId();
                                Integer num3 = commentaryGoalModal.F().d;
                                b43Var.r(new e43(i3, player, num2, z, num3 != null && id2 == num3.intValue(), commentaryGoalModal.F().j));
                            }
                        }
                        Player player2 = commentaryGoalModal.F().b;
                        if (player2 != null) {
                            Context requireContext4 = commentaryGoalModal.requireContext();
                            requireContext4.getClass();
                            b43Var.r(new d43(hkg.Q(requireContext4, R.string.goalkeeper, (Gender) commentaryGoalModal.B.getValue(), new Object[0]), ((Number) joaVar.getValue()).intValue()));
                            b43Var.r(new e43(commentaryGoalModal.F().g, player2, null, false, false, false));
                        }
                        b43Var.a.d = new kr1(commentaryGoalModal, 20);
                        return b43Var;
                    case 4:
                        Bundle requireArguments = commentaryGoalModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "goalInfo", g43.class);
                        if (M != null) {
                            return (g43) M;
                        }
                        a70.p("Serializable goalInfo not found");
                        return null;
                    default:
                        Bundle requireArguments2 = commentaryGoalModal.requireArguments();
                        requireArguments2.getClass();
                        return (Gender) gz8.M(requireArguments2, "GENDER", Gender.class);
                }
            }
        });
        final int i3 = 2;
        this.y = ypa.a(ysaVar, new Function0(this) { // from class: a43
            public final /* synthetic */ CommentaryGoalModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CommentaryGoalModal commentaryGoalModal = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = commentaryGoalModal.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.s(2, requireContext));
                    case 1:
                        Context requireContext2 = commentaryGoalModal.requireContext();
                        requireContext2.getClass();
                        return Integer.valueOf(ao2.s(16, requireContext2));
                    case 2:
                        Context requireContext3 = commentaryGoalModal.requireContext();
                        requireContext3.getClass();
                        return Integer.valueOf(ao2.s(24, requireContext3));
                    case 3:
                        joa joaVar = commentaryGoalModal.y;
                        b43 b43Var = new b43(commentaryGoalModal);
                        if (commentaryGoalModal.F().h) {
                            b43Var.r(new c43(R.drawable.ic_football_glove, R.string.football_goalkeeper_save));
                        }
                        if (commentaryGoalModal.F().i) {
                            b43Var.r(new c43(R.drawable.ic_football_woodwork, R.string.football_hit_woodwork));
                        }
                        if (!commentaryGoalModal.F().a.isEmpty()) {
                            String string = commentaryGoalModal.getString(R.string.goal_animation_key_participants);
                            string.getClass();
                            b43Var.r(new d43(string, b43Var.getItemCount() > 0 ? ((Number) joaVar.getValue()).intValue() : ((Number) commentaryGoalModal.x.getValue()).intValue()));
                            Iterator it = commentaryGoalModal.F().a.iterator();
                            while (it.hasNext()) {
                                Player player = (Player) it.next();
                                int id = player.getId();
                                Integer num = commentaryGoalModal.F().c;
                                boolean z = num != null && id == num.intValue();
                                int i32 = (z && commentaryGoalModal.F().j) ? commentaryGoalModal.F().g : commentaryGoalModal.F().f;
                                Integer num2 = z ? commentaryGoalModal.F().e : null;
                                int id2 = player.getId();
                                Integer num3 = commentaryGoalModal.F().d;
                                b43Var.r(new e43(i32, player, num2, z, num3 != null && id2 == num3.intValue(), commentaryGoalModal.F().j));
                            }
                        }
                        Player player2 = commentaryGoalModal.F().b;
                        if (player2 != null) {
                            Context requireContext4 = commentaryGoalModal.requireContext();
                            requireContext4.getClass();
                            b43Var.r(new d43(hkg.Q(requireContext4, R.string.goalkeeper, (Gender) commentaryGoalModal.B.getValue(), new Object[0]), ((Number) joaVar.getValue()).intValue()));
                            b43Var.r(new e43(commentaryGoalModal.F().g, player2, null, false, false, false));
                        }
                        b43Var.a.d = new kr1(commentaryGoalModal, 20);
                        return b43Var;
                    case 4:
                        Bundle requireArguments = commentaryGoalModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "goalInfo", g43.class);
                        if (M != null) {
                            return (g43) M;
                        }
                        a70.p("Serializable goalInfo not found");
                        return null;
                    default:
                        Bundle requireArguments2 = commentaryGoalModal.requireArguments();
                        requireArguments2.getClass();
                        return (Gender) gz8.M(requireArguments2, "GENDER", Gender.class);
                }
            }
        });
        final int i4 = 3;
        this.z = ypa.a(ysaVar, new Function0(this) { // from class: a43
            public final /* synthetic */ CommentaryGoalModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                CommentaryGoalModal commentaryGoalModal = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = commentaryGoalModal.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.s(2, requireContext));
                    case 1:
                        Context requireContext2 = commentaryGoalModal.requireContext();
                        requireContext2.getClass();
                        return Integer.valueOf(ao2.s(16, requireContext2));
                    case 2:
                        Context requireContext3 = commentaryGoalModal.requireContext();
                        requireContext3.getClass();
                        return Integer.valueOf(ao2.s(24, requireContext3));
                    case 3:
                        joa joaVar = commentaryGoalModal.y;
                        b43 b43Var = new b43(commentaryGoalModal);
                        if (commentaryGoalModal.F().h) {
                            b43Var.r(new c43(R.drawable.ic_football_glove, R.string.football_goalkeeper_save));
                        }
                        if (commentaryGoalModal.F().i) {
                            b43Var.r(new c43(R.drawable.ic_football_woodwork, R.string.football_hit_woodwork));
                        }
                        if (!commentaryGoalModal.F().a.isEmpty()) {
                            String string = commentaryGoalModal.getString(R.string.goal_animation_key_participants);
                            string.getClass();
                            b43Var.r(new d43(string, b43Var.getItemCount() > 0 ? ((Number) joaVar.getValue()).intValue() : ((Number) commentaryGoalModal.x.getValue()).intValue()));
                            Iterator it = commentaryGoalModal.F().a.iterator();
                            while (it.hasNext()) {
                                Player player = (Player) it.next();
                                int id = player.getId();
                                Integer num = commentaryGoalModal.F().c;
                                boolean z = num != null && id == num.intValue();
                                int i32 = (z && commentaryGoalModal.F().j) ? commentaryGoalModal.F().g : commentaryGoalModal.F().f;
                                Integer num2 = z ? commentaryGoalModal.F().e : null;
                                int id2 = player.getId();
                                Integer num3 = commentaryGoalModal.F().d;
                                b43Var.r(new e43(i32, player, num2, z, num3 != null && id2 == num3.intValue(), commentaryGoalModal.F().j));
                            }
                        }
                        Player player2 = commentaryGoalModal.F().b;
                        if (player2 != null) {
                            Context requireContext4 = commentaryGoalModal.requireContext();
                            requireContext4.getClass();
                            b43Var.r(new d43(hkg.Q(requireContext4, R.string.goalkeeper, (Gender) commentaryGoalModal.B.getValue(), new Object[0]), ((Number) joaVar.getValue()).intValue()));
                            b43Var.r(new e43(commentaryGoalModal.F().g, player2, null, false, false, false));
                        }
                        b43Var.a.d = new kr1(commentaryGoalModal, 20);
                        return b43Var;
                    case 4:
                        Bundle requireArguments = commentaryGoalModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "goalInfo", g43.class);
                        if (M != null) {
                            return (g43) M;
                        }
                        a70.p("Serializable goalInfo not found");
                        return null;
                    default:
                        Bundle requireArguments2 = commentaryGoalModal.requireArguments();
                        requireArguments2.getClass();
                        return (Gender) gz8.M(requireArguments2, "GENDER", Gender.class);
                }
            }
        });
        final int i5 = 4;
        this.A = ypa.b(new Function0(this) { // from class: a43
            public final /* synthetic */ CommentaryGoalModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CommentaryGoalModal commentaryGoalModal = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = commentaryGoalModal.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.s(2, requireContext));
                    case 1:
                        Context requireContext2 = commentaryGoalModal.requireContext();
                        requireContext2.getClass();
                        return Integer.valueOf(ao2.s(16, requireContext2));
                    case 2:
                        Context requireContext3 = commentaryGoalModal.requireContext();
                        requireContext3.getClass();
                        return Integer.valueOf(ao2.s(24, requireContext3));
                    case 3:
                        joa joaVar = commentaryGoalModal.y;
                        b43 b43Var = new b43(commentaryGoalModal);
                        if (commentaryGoalModal.F().h) {
                            b43Var.r(new c43(R.drawable.ic_football_glove, R.string.football_goalkeeper_save));
                        }
                        if (commentaryGoalModal.F().i) {
                            b43Var.r(new c43(R.drawable.ic_football_woodwork, R.string.football_hit_woodwork));
                        }
                        if (!commentaryGoalModal.F().a.isEmpty()) {
                            String string = commentaryGoalModal.getString(R.string.goal_animation_key_participants);
                            string.getClass();
                            b43Var.r(new d43(string, b43Var.getItemCount() > 0 ? ((Number) joaVar.getValue()).intValue() : ((Number) commentaryGoalModal.x.getValue()).intValue()));
                            Iterator it = commentaryGoalModal.F().a.iterator();
                            while (it.hasNext()) {
                                Player player = (Player) it.next();
                                int id = player.getId();
                                Integer num = commentaryGoalModal.F().c;
                                boolean z = num != null && id == num.intValue();
                                int i32 = (z && commentaryGoalModal.F().j) ? commentaryGoalModal.F().g : commentaryGoalModal.F().f;
                                Integer num2 = z ? commentaryGoalModal.F().e : null;
                                int id2 = player.getId();
                                Integer num3 = commentaryGoalModal.F().d;
                                b43Var.r(new e43(i32, player, num2, z, num3 != null && id2 == num3.intValue(), commentaryGoalModal.F().j));
                            }
                        }
                        Player player2 = commentaryGoalModal.F().b;
                        if (player2 != null) {
                            Context requireContext4 = commentaryGoalModal.requireContext();
                            requireContext4.getClass();
                            b43Var.r(new d43(hkg.Q(requireContext4, R.string.goalkeeper, (Gender) commentaryGoalModal.B.getValue(), new Object[0]), ((Number) joaVar.getValue()).intValue()));
                            b43Var.r(new e43(commentaryGoalModal.F().g, player2, null, false, false, false));
                        }
                        b43Var.a.d = new kr1(commentaryGoalModal, 20);
                        return b43Var;
                    case 4:
                        Bundle requireArguments = commentaryGoalModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "goalInfo", g43.class);
                        if (M != null) {
                            return (g43) M;
                        }
                        a70.p("Serializable goalInfo not found");
                        return null;
                    default:
                        Bundle requireArguments2 = commentaryGoalModal.requireArguments();
                        requireArguments2.getClass();
                        return (Gender) gz8.M(requireArguments2, "GENDER", Gender.class);
                }
            }
        });
        final int i6 = 5;
        this.B = ypa.b(new Function0(this) { // from class: a43
            public final /* synthetic */ CommentaryGoalModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CommentaryGoalModal commentaryGoalModal = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = commentaryGoalModal.requireContext();
                        requireContext.getClass();
                        return Integer.valueOf(ao2.s(2, requireContext));
                    case 1:
                        Context requireContext2 = commentaryGoalModal.requireContext();
                        requireContext2.getClass();
                        return Integer.valueOf(ao2.s(16, requireContext2));
                    case 2:
                        Context requireContext3 = commentaryGoalModal.requireContext();
                        requireContext3.getClass();
                        return Integer.valueOf(ao2.s(24, requireContext3));
                    case 3:
                        joa joaVar = commentaryGoalModal.y;
                        b43 b43Var = new b43(commentaryGoalModal);
                        if (commentaryGoalModal.F().h) {
                            b43Var.r(new c43(R.drawable.ic_football_glove, R.string.football_goalkeeper_save));
                        }
                        if (commentaryGoalModal.F().i) {
                            b43Var.r(new c43(R.drawable.ic_football_woodwork, R.string.football_hit_woodwork));
                        }
                        if (!commentaryGoalModal.F().a.isEmpty()) {
                            String string = commentaryGoalModal.getString(R.string.goal_animation_key_participants);
                            string.getClass();
                            b43Var.r(new d43(string, b43Var.getItemCount() > 0 ? ((Number) joaVar.getValue()).intValue() : ((Number) commentaryGoalModal.x.getValue()).intValue()));
                            Iterator it = commentaryGoalModal.F().a.iterator();
                            while (it.hasNext()) {
                                Player player = (Player) it.next();
                                int id = player.getId();
                                Integer num = commentaryGoalModal.F().c;
                                boolean z = num != null && id == num.intValue();
                                int i32 = (z && commentaryGoalModal.F().j) ? commentaryGoalModal.F().g : commentaryGoalModal.F().f;
                                Integer num2 = z ? commentaryGoalModal.F().e : null;
                                int id2 = player.getId();
                                Integer num3 = commentaryGoalModal.F().d;
                                b43Var.r(new e43(i32, player, num2, z, num3 != null && id2 == num3.intValue(), commentaryGoalModal.F().j));
                            }
                        }
                        Player player2 = commentaryGoalModal.F().b;
                        if (player2 != null) {
                            Context requireContext4 = commentaryGoalModal.requireContext();
                            requireContext4.getClass();
                            b43Var.r(new d43(hkg.Q(requireContext4, R.string.goalkeeper, (Gender) commentaryGoalModal.B.getValue(), new Object[0]), ((Number) joaVar.getValue()).intValue()));
                            b43Var.r(new e43(commentaryGoalModal.F().g, player2, null, false, false, false));
                        }
                        b43Var.a.d = new kr1(commentaryGoalModal, 20);
                        return b43Var;
                    case 4:
                        Bundle requireArguments = commentaryGoalModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "goalInfo", g43.class);
                        if (M != null) {
                            return (g43) M;
                        }
                        a70.p("Serializable goalInfo not found");
                        return null;
                    default:
                        Bundle requireArguments2 = commentaryGoalModal.requireArguments();
                        requireArguments2.getClass();
                        return (Gender) gz8.M(requireArguments2, "GENDER", Gender.class);
                }
            }
        });
        this.C = true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        RecyclerView recyclerView = w74.b(layoutInflater, null).c;
        Context context = recyclerView.getContext();
        context.getClass();
        z8e.b0(recyclerView, context, false, false, null, 22);
        recyclerView.setAdapter((b43) this.z.getValue());
        s(recyclerView);
        return recyclerView;
    }

    public final g43 F() {
        return (g43) this.A.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n(0, R.style.ResizableBottomSheetDialog);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((FrameLayout) v().m).setVisibility(8);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("analyticsName")) == null) ? "CommentaryGoalDetailsModal" : string;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getX() {
        return this.C;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
