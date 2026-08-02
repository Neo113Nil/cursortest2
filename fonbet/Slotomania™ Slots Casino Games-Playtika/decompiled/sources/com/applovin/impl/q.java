package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.d;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.u2;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class q extends p3 {
    private com.applovin.impl.sdk.l a;
    private u2 b;
    private List c;
    private boolean d;
    private ListView e;

    class a extends u2 {
        final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.e = list;
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i) {
            return q.this.c;
        }

        @Override // com.applovin.impl.u2
        protected int d(int i) {
            return this.e.size();
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i) {
            return new x4("");
        }
    }

    @Override // com.applovin.impl.p3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.a;
    }

    public void initialize(final List<n> list, boolean z, final com.applovin.impl.sdk.l lVar) {
        this.d = z;
        this.a = lVar;
        this.c = a(list);
        a aVar = new a(this, list);
        this.b = aVar;
        aVar.a(new u2.a() { // from class: com.applovin.impl.q$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.u2.a
            public final void a(l2 l2Var, t2 t2Var) {
                q.this.a(list, lVar, l2Var, t2Var);
            }
        });
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.d ? "Selective Init " : "").concat("Ad Units"));
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.e = listView;
        listView.setAdapter((ListAdapter) this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final com.applovin.impl.sdk.l lVar, l2 l2Var, t2 t2Var) {
        final n nVar = (n) list.get(l2Var.a());
        if (nVar.g().size() == 1) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.q$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    ((MaxDebuggerAdUnitDetailActivity) activity).initialize(n.this, null, null, lVar);
                }
            });
        } else {
            d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.q$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(n.this, lVar);
                }
            });
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(nVar.c(), ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(nVar.b(), ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(t2.a(t2.c.DETAIL).b(StringUtils.createSpannedString(nVar.d(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
