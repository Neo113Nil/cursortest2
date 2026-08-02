package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.t2;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class l8 extends p3 {
    private String a;
    private com.applovin.impl.sdk.l b;
    private u2 c;

    class a extends u2 {
        final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.e = list;
        }

        @Override // com.applovin.impl.u2
        protected t2 a() {
            return new t2.b(t2.c.SECTION_CENTERED).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i) {
            return this.e;
        }

        @Override // com.applovin.impl.u2
        protected int d(int i) {
            return this.e.size();
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i) {
            return new x4("SEGMENT TARGETING");
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(t2.a(t2.c.DETAIL).d((String) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.p3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.b;
    }

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.l lVar) {
        this.a = str;
        this.b = lVar;
        a aVar = new a(this, a(list));
        this.c = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.a);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.c);
    }
}
