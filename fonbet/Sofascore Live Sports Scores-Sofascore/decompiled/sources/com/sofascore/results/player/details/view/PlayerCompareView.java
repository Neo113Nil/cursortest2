package com.sofascore.results.player.details.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.AttributeOverviewData;
import com.sofascore.model.newNetwork.AttributeOverviewResponse;
import com.sofascore.results.R;
import com.sofascore.results.view.SofaTextInputLayout;
import com.sofascore.results.view.graph.AttributeOverviewGraph;
import defpackage.ajh;
import defpackage.apf;
import defpackage.as9;
import defpackage.cd5;
import defpackage.eyd;
import defpackage.fl8;
import defpackage.gh5;
import defpackage.ht9;
import defpackage.i63;
import defpackage.ke0;
import defpackage.moe;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.nzd;
import defpackage.o8;
import defpackage.pme;
import defpackage.qm0;
import defpackage.qme;
import defpackage.rfe;
import defpackage.ujg;
import defpackage.v9b;
import defpackage.vt9;
import defpackage.yh5;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z82;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/sofascore/results/player/details/view/PlayerCompareView;", "Lo8;", "", "getLayoutId", "()I", "Lcom/sofascore/model/newNetwork/AttributeOverviewResponse;", "playerData", "", "setPlayerAttributeOverview", "(Lcom/sofascore/model/newNetwork/AttributeOverviewResponse;)V", "Lqme;", "e", "Ljoa;", "getPlayerAdapter", "()Lqme;", "playerAdapter", "Lpme;", InneractiveMediationDefs.GENDER_FEMALE, "Lpme;", "getCallback", "()Lpme;", "setCallback", "(Lpme;)V", "callback", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerCompareView extends o8 {
    public static final /* synthetic */ int g = 0;
    public final rfe d;
    public final mqi e;

    /* renamed from: f, reason: from kotlin metadata */
    public pme callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerCompareView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.player_compare_image;
        ImageView imageView = (ImageView) nq8.B(R.id.player_compare_image, root);
        if (imageView != null) {
            i = R.id.player_compare_text_input;
            SofaTextInputLayout sofaTextInputLayout = (SofaTextInputLayout) nq8.B(R.id.player_compare_text_input, root);
            if (sofaTextInputLayout != null) {
                i = R.id.player_compare_view_auto_complete;
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) nq8.B(R.id.player_compare_view_auto_complete, root);
                if (autoCompleteTextView != null) {
                    i = R.id.pointer;
                    if (((ImageView) nq8.B(R.id.pointer, root)) != null) {
                        this.d = new rfe(1, sofaTextInputLayout, autoCompleteTextView, (LinearLayout) root, imageView);
                        this.e = ypa.b(new nzd(context, 1));
                        Integer valueOf = Integer.valueOf(R.drawable.player_photo_placeholder);
                        apf a = ajh.a(imageView.getContext());
                        ht9 ht9Var = new ht9(imageView.getContext());
                        ht9Var.c = valueOf;
                        vt9.f(ht9Var, imageView);
                        a.a(ht9Var.a());
                        sofaTextInputLayout.setEndIconVisible(false);
                        sofaTextInputLayout.setEndIconOnClickListener(new cd5(this, 28));
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final qme getPlayerAdapter() {
        return (qme) this.e.getValue();
    }

    public static final void n(PlayerCompareView playerCompareView, int i) {
        pme pmeVar = playerCompareView.callback;
        rfe rfeVar = playerCompareView.d;
        if (pmeVar != null) {
            ((fl8) ((ujg) pmeVar).c).invoke();
        }
        Object obj = playerCompareView.getPlayerAdapter().c.get(i);
        obj.getClass();
        Player player = (Player) obj;
        ((AutoCompleteTextView) rfeVar.e).clearFocus();
        Context context = playerCompareView.getContext();
        context.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(playerCompareView.getWindowToken(), 0);
        }
        ImageView imageView = (ImageView) rfeVar.c;
        imageView.setClickable(true);
        as9.l(imageView, player.getId(), null);
        imageView.setOnClickListener(new eyd(6, imageView, player));
        pme pmeVar2 = playerCompareView.callback;
        if (pmeVar2 != null) {
            ((v9b) ((ujg) pmeVar2).e).invoke(Integer.valueOf(player.getId()));
        }
    }

    @Nullable
    public final pme getCallback() {
        return this.callback;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.player_details_compare_view;
    }

    public final void j() {
        rfe rfeVar = this.d;
        ((AutoCompleteTextView) rfeVar.e).setText("");
        ImageView imageView = (ImageView) rfeVar.c;
        imageView.setClickable(false);
        Integer valueOf = Integer.valueOf(R.drawable.player_photo_placeholder);
        apf a = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = valueOf;
        vt9.f(ht9Var, imageView);
        a.a(ht9Var.a());
        Context context = getContext();
        context.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public final void l(Player player) {
        player.getClass();
        rfe rfeVar = this.d;
        ((AutoCompleteTextView) rfeVar.e).setThreshold(2);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) rfeVar.e;
        autoCompleteTextView.setAdapter(getPlayerAdapter());
        ((SofaTextInputLayout) rfeVar.d).setHint(getContext().getString(Intrinsics.c(player.getPosition(), "G") ? R.string.search_to_compare_keepers : R.string.search_to_compare_players));
        autoCompleteTextView.addTextChangedListener(new i63(3, this, player));
        autoCompleteTextView.setOnItemClickListener(new yh5(this, 2));
    }

    public final void o(List list) {
        qme playerAdapter = getPlayerAdapter();
        playerAdapter.getClass();
        playerAdapter.c = new ArrayList(list);
        playerAdapter.notifyDataSetChanged();
    }

    public final void setCallback(@Nullable pme pmeVar) {
        this.callback = pmeVar;
    }

    public final void setPlayerAttributeOverview(@Nullable AttributeOverviewResponse playerData) {
        Unit unit;
        int colorPrimaryDefault;
        if (playerData != null) {
            pme pmeVar = this.callback;
            if (pmeVar != null) {
                moe moeVar = (moe) ((ujg) pmeVar).b;
                z82 z82Var = moeVar.d;
                boolean z = (3 - ((SeekBar) ((PlayerPentagonSlider) z82Var.g).d.k).getProgress() == 0 || moeVar.g == null) ? false : true;
                moeVar.g = playerData;
                PlayerPentagonSlider playerPentagonSlider = (PlayerPentagonSlider) z82Var.g;
                AttributeOverviewGraph attributeOverviewGraph = (AttributeOverviewGraph) z82Var.f;
                ((SeekBar) playerPentagonSlider.d.k).setProgress(3);
                if (playerData.getCurrentAttributes() != null) {
                    if (z) {
                        attributeOverviewGraph.c(moeVar.f);
                    }
                    ((gh5) z82Var.d).d.setText(moeVar.getContext().getString(R.string.attribute_overview_displayed));
                } else {
                    Calendar calendar = ke0.a;
                    Context context = moeVar.getContext();
                    context.getClass();
                    ke0.g(context, moeVar.getContext().getString(R.string.no_attribute_overview), 0);
                }
                AttributeOverviewData currentAttributes = playerData.getCurrentAttributes();
                colorPrimaryDefault = moeVar.getColorPrimaryDefault();
                AttributeOverviewGraph.d(attributeOverviewGraph, currentAttributes, colorPrimaryDefault, qm0.c, true, 16);
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        pme pmeVar2 = this.callback;
        if (pmeVar2 != null) {
            moe moeVar2 = (moe) ((ujg) pmeVar2).b;
            AttributeOverviewResponse attributeOverviewResponse = moeVar2.g;
            z82 z82Var2 = moeVar2.d;
            if (attributeOverviewResponse != null) {
                ((AttributeOverviewGraph) z82Var2.f).c(moeVar2.f);
                ((SeekBar) ((PlayerPentagonSlider) z82Var2.g).d.k).setProgress(3);
            }
            Calendar calendar2 = ke0.a;
            Context context2 = moeVar2.getContext();
            context2.getClass();
            ke0.g(context2, moeVar2.getContext().getString(R.string.no_attribute_overview), 0);
            PlayerCompareView playerCompareView = (PlayerCompareView) z82Var2.c;
            playerCompareView.j();
            ((AutoCompleteTextView) playerCompareView.d.e).clearFocus();
            moeVar2.g = null;
            Unit unit2 = Unit.a;
        }
    }
}
