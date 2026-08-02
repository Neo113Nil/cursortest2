package com.bytedance.sdk.openadsdk.gbb.pcc;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.wh.kj;
import com.bytedance.sdk.openadsdk.core.wh.oo;
import com.bytedance.sdk.openadsdk.core.wh.vj;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.hrf;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends l {
    private Context pcc;
    private InterfaceC0110sf vj;
    private List<Object> sf = new ArrayList();
    private List<com.bytedance.sdk.openadsdk.gbb.pcc.pcc> gm = new ArrayList();
    private List<com.bytedance.sdk.openadsdk.gbb.pcc.pcc> oo = new ArrayList();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class gm extends u {
        kj pcc;

        public gm(View view) {
            super(view);
            this.pcc = (kj) view;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class pcc extends u {
        kj gm;
        kj oo;
        oo pcc;
        kj sf;

        public pcc(View view) {
            super(view);
            View[] viewArr = (View[]) view.getTag();
            this.pcc = (oo) viewArr[0];
            this.sf = (kj) viewArr[1];
            this.gm = (kj) viewArr[2];
            this.oo = (kj) viewArr[3];
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.gbb.pcc.sf.pcc.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int adapterPosition = pcc.this.getAdapterPosition();
                    if (adapterPosition != -1) {
                        Object obj = sf.this.sf.get(adapterPosition);
                        if (obj instanceof com.bytedance.sdk.openadsdk.gbb.pcc.pcc) {
                            sf.this.pcc((com.bytedance.sdk.openadsdk.gbb.pcc.pcc) obj);
                        }
                    }
                }
            });
        }

        public void pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar) {
            try {
                String vj = pccVar.vj();
                this.sf.setText(pccVar.oo());
                this.gm.setText(vj);
                this.oo.setText(new SimpleDateFormat("MMM dd · HH:mm", Locale.US).format(new Date(Long.parseLong(pccVar.wh()))));
                this.pcc.setImageResource(R.drawable.tt_history_placeholder);
                if (TextUtils.isEmpty(vj)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.ork.oo.pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().pcc(vj)).gm(1).pcc(this.pcc);
            } catch (Exception e) {
                lo.pcc("IABHSecAdapter", "bind error: ", e);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.gbb.pcc.sf$sf, reason: collision with other inner class name */
    public interface InterfaceC0110sf {
        void pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar);
    }

    public sf(Context context) {
        this.pcc = context.getApplicationContext();
    }

    private vj sf() {
        vj vjVar = new vj(this.pcc);
        vjVar.setOrientation(0);
        vjVar.setLayoutParams(new hrf(-1, pcc(84.0f)));
        vjVar.setPadding(pcc(16.0f), pcc(10.0f), pcc(16.0f), pcc(10.0f));
        vj vjVar2 = new vj(this.pcc);
        vjVar2.setOrientation(1);
        oo ooVar = new oo(this.pcc);
        ooVar.setId(View.generateViewId());
        ooVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ooVar.setAdjustViewBounds(true);
        ooVar.setLayoutParams(new LinearLayout.LayoutParams(pcc(64.0f), pcc(64.0f)));
        vjVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        vjVar2.setPadding(pcc(8.0f), pcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        kj kjVar = new kj(this.pcc);
        kjVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        kjVar.setTextAppearance(android.R.style.TextAppearance.Material.Medium);
        int i = Build.VERSION.SDK_INT;
        Typeface create = i >= 28 ? Typeface.create(kjVar.getTypeface(), 500, false) : null;
        if (create != null) {
            kjVar.setTypeface(create);
        }
        kjVar.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.3f);
        kjVar.setLetterSpacing(0.0067f);
        kjVar.setTextColor(Color.argb(255, 0, 0, 0));
        kjVar.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        kjVar.setEllipsize(truncateAt);
        kjVar.setId(View.generateViewId());
        kjVar.setTextSize(0, pcc(14.0f));
        kjVar.setIncludeFontPadding(false);
        kj kjVar2 = new kj(this.pcc);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = pcc(4.0f);
        kjVar2.setLayoutParams(layoutParams);
        Typeface create2 = i >= 28 ? Typeface.create(kjVar.getTypeface(), 400, false) : null;
        if (create2 != null) {
            kjVar2.setTypeface(create2);
        }
        kjVar2.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.3f);
        kjVar2.setLetterSpacing(0.0067f);
        kjVar2.setTextColor(Color.argb(166, 0, 0, 0));
        kjVar2.setMaxLines(1);
        kjVar2.setEllipsize(truncateAt);
        kjVar2.setId(View.generateViewId());
        kjVar2.setTextSize(0, pcc(14.0f));
        kjVar2.setIncludeFontPadding(false);
        kj kjVar3 = new kj(this.pcc);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = pcc(8.0f);
        kjVar3.setLayoutParams(layoutParams2);
        kjVar3.setTextAppearance(android.R.style.TextAppearance.Material.Caption);
        kjVar3.setTextColor(Color.argb(166, 0, 0, 0));
        kjVar3.setId(View.generateViewId());
        Typeface create3 = i >= 28 ? Typeface.create(kjVar.getTypeface(), 400, false) : null;
        if (create3 != null) {
            kjVar3.setTypeface(create3);
        }
        kjVar3.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.3f);
        kjVar3.setLetterSpacing(0.0067f);
        kjVar3.setTextColor(Color.argb(166, 0, 0, 0));
        kjVar3.setMaxLines(1);
        kjVar3.setEllipsize(truncateAt);
        kjVar3.setId(View.generateViewId());
        kjVar3.setTextSize(0, pcc(12.0f));
        kjVar3.setIncludeFontPadding(false);
        vjVar.addView(ooVar);
        vjVar.addView(vjVar2);
        vjVar2.addView(kjVar);
        vjVar2.addView(kjVar2);
        vjVar2.addView(kjVar3);
        vjVar.setTag(new View[]{ooVar, kjVar, kjVar2, kjVar3});
        return vjVar;
    }

    @Override // androidx.recyclerview.widget.l
    public int getItemCount() {
        return this.sf.size();
    }

    @Override // androidx.recyclerview.widget.l
    public int getItemViewType(int i) {
        return this.sf.get(i) instanceof String ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.l
    public void onBindViewHolder(u uVar, int i) {
        Object obj = this.sf.get(i);
        if (uVar.getItemViewType() == 0) {
            ((gm) uVar).pcc.setText((String) obj);
        } else {
            ((pcc) uVar).pcc((com.bytedance.sdk.openadsdk.gbb.pcc.pcc) obj);
        }
    }

    @Override // androidx.recyclerview.widget.l
    @NonNull
    public u onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new pcc(sf());
        }
        kj kjVar = new kj(this.pcc);
        kjVar.setPadding(pcc(16.0f), pcc(8.0f), 0, pcc(8.0f));
        kjVar.setTextSize(14.0f);
        kjVar.setTextAppearance(android.R.style.TextAppearance.Material.Medium);
        Typeface create = Build.VERSION.SDK_INT >= 28 ? Typeface.create(kjVar.getTypeface(), 500, false) : null;
        if (create != null) {
            kjVar.setTypeface(create);
        }
        kjVar.setTextColor(Color.argb(167, 0, 0, 0));
        kjVar.setLayoutParams(new hrf(-1, -2));
        return new gm(kjVar);
    }

    public void pcc(List<com.bytedance.sdk.openadsdk.gbb.pcc.pcc> list) {
        this.gm.clear();
        this.oo.clear();
        if (list != null) {
            long currentTimeMillis = System.currentTimeMillis() - 604800000;
            for (com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar : list) {
                try {
                    if (Long.parseLong(pccVar.wh()) >= currentTimeMillis) {
                        this.gm.add(pccVar);
                    } else {
                        this.oo.add(pccVar);
                    }
                } catch (NumberFormatException unused) {
                    this.gm.add(pccVar);
                }
            }
        }
        pcc();
        notifyDataSetChanged();
    }

    public void pcc(InterfaceC0110sf interfaceC0110sf) {
        this.vj = interfaceC0110sf;
    }

    private void pcc() {
        this.sf.clear();
        if (!this.gm.isEmpty()) {
            List<Object> list = this.sf;
            Context context = this.pcc;
            list.add(context.getString(tz.sf(context, "tt_history_this_week")));
            this.sf.addAll(this.gm);
        }
        if (this.oo.isEmpty()) {
            return;
        }
        List<Object> list2 = this.sf;
        Context context2 = this.pcc;
        list2.add(context2.getString(tz.sf(context2, "tt_history_a_week_ago")));
        this.sf.addAll(this.oo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar) {
        InterfaceC0110sf interfaceC0110sf = this.vj;
        if (interfaceC0110sf != null) {
            interfaceC0110sf.pcc(pccVar);
        }
    }

    private int pcc(float f) {
        return rj.sf(this.pcc, f);
    }
}
