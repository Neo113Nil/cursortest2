package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import defpackage.cb;
import defpackage.de0;
import defpackage.ftj;
import defpackage.osj;
import defpackage.rsj;
import defpackage.suj;
import defpackage.zsj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public static final /* synthetic */ int m = 0;
    public final int a;
    public final LayoutInflater b;
    public final CheckedTextView c;
    public final CheckedTextView d;
    public final cb e;
    public final ArrayList f;
    public final HashMap g;
    public boolean h;
    public boolean i;
    public rsj j;
    public CheckedTextView[][] k;
    public boolean l;

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.b = from;
        cb cbVar = new cb(this, 11);
        this.e = cbVar;
        this.j = new de0(getResources());
        this.f = new ArrayList();
        this.g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.sofascore.results.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(cbVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(com.sofascore.results.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.sofascore.results.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(cbVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.c.setChecked(this.l);
        boolean z = this.l;
        HashMap hashMap = this.g;
        this.d.setChecked(!z && hashMap.isEmpty());
        for (int i = 0; i < this.k.length; i++) {
            zsj zsjVar = (zsj) hashMap.get(((suj) this.f.get(i)).b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.k[i];
                if (i2 < checkedTextViewArr.length) {
                    if (zsjVar != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.k[i][i2].setChecked(zsjVar.b.contains(Integer.valueOf(((ftj) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.d;
        CheckedTextView checkedTextView2 = this.c;
        if (isEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.k = new CheckedTextView[arrayList.size()][];
        boolean z = this.i && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            suj sujVar = (suj) arrayList.get(i);
            boolean z2 = this.h && sujVar.c;
            CheckedTextView[][] checkedTextViewArr = this.k;
            int i2 = sujVar.a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            ftj[] ftjVarArr = new ftj[i2];
            for (int i3 = 0; i3 < sujVar.a; i3++) {
                ftjVarArr[i3] = new ftj(sujVar, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.b;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(com.sofascore.results.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.a);
                rsj rsjVar = this.j;
                ftj ftjVar = ftjVarArr[i4];
                checkedTextView3.setText(((de0) rsjVar).w(ftjVar.a.b.d[ftjVar.b]));
                checkedTextView3.setTag(ftjVarArr[i4]);
                if (sujVar.a(i4)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.k[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.l;
    }

    public Map<osj, zsj> getOverrides() {
        return this.g;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.h != z) {
            this.h = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (!z) {
                HashMap hashMap = this.g;
                if (hashMap.size() > 1) {
                    HashMap hashMap2 = new HashMap();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.f;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        zsj zsjVar = (zsj) hashMap.get(((suj) arrayList.get(i)).b);
                        if (zsjVar != null && hashMap2.isEmpty()) {
                            hashMap2.put(zsjVar.a, zsjVar);
                        }
                        i++;
                    }
                    hashMap.clear();
                    hashMap.putAll(hashMap2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(rsj rsjVar) {
        rsjVar.getClass();
        this.j = rsjVar;
        b();
    }
}
