package com.vk.newsfeed.impl.posting.viewpresenter.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bwt0;
import xsna.krv0;
import xsna.pdc;
import xsna.zrp;

/* compiled from: CharacterCounterView.kt */
/* loaded from: classes4.dex */
public final class CharacterCounterView extends FrameLayout {
    public int b;
    public int c;
    public int d;
    public final int e;
    public final ProgressBar f;
    public final TextView g;
    public final pdc h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CharacterCounterView.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C1392a Companion;
        public static final a ERROR;
        public static final a NORMAL;
        public static final a WARNING;
        private final int warningCharactersLeft;

        /* compiled from: CharacterCounterView.kt */
        /* renamed from: com.vk.newsfeed.impl.posting.viewpresenter.bottom.CharacterCounterView$a$a, reason: collision with other inner class name */
        public static final class C1392a {
            public static a a(int i) {
                a aVar;
                a[] values = a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i2];
                    if (aVar.a(i)) {
                        break;
                    }
                    i2++;
                }
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("unknown state");
            }
        }

        /* compiled from: CharacterCounterView.kt */
        public static final class b extends a {
            @Override // com.vk.newsfeed.impl.posting.viewpresenter.bottom.CharacterCounterView.a
            public final boolean a(int i) {
                return i <= 0;
            }
        }

        /* compiled from: CharacterCounterView.kt */
        public static final class c extends a {
            @Override // com.vk.newsfeed.impl.posting.viewpresenter.bottom.CharacterCounterView.a
            public final boolean a(int i) {
                return i > h();
            }
        }

        /* compiled from: CharacterCounterView.kt */
        public static final class d extends a {
            @Override // com.vk.newsfeed.impl.posting.viewpresenter.bottom.CharacterCounterView.a
            public final boolean a(int i) {
                return 1 <= i && i <= h();
            }
        }

        static {
            c cVar = new c("NORMAL", 0);
            NORMAL = cVar;
            d dVar = new d("WARNING", 1);
            WARNING = dVar;
            b bVar = new b("ERROR", 2);
            ERROR = bVar;
            a[] aVarArr = {cVar, dVar, bVar};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
            Companion = new C1392a();
        }

        public a() {
            throw null;
        }

        public a(String str, int i) {
            this.warningCharactersLeft = 20;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public abstract boolean a(int i);

        public final int h() {
            return this.warningCharactersLeft;
        }
    }

    /* compiled from: CharacterCounterView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CharacterCounterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = this.c;
        this.e = -999;
        int color = context.getColor(R.color.vk_gray_100);
        this.i = color;
        int color2 = context.getColor(R.color.vk_azure_300);
        this.j = color2;
        this.k = context.getColor(R.color.vk_orange);
        this.l = context.getColor(R.color.vk_red);
        LayoutInflater.from(context).inflate(R.layout.layout_character_counter, this);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.character_counter_progress);
        this.f = progressBar;
        this.g = (TextView) findViewById(R.id.character_counter_text);
        progressBar.setMax(this.b);
        pdc pdcVar = new pdc(false);
        pdcVar.e = false;
        pdcVar.f = false;
        pdcVar.b();
        this.h = pdcVar;
        progressBar.setProgressDrawable(pdcVar);
        pdcVar.a(color, color2);
        pdcVar.invalidateSelf();
    }

    public final void a() {
        String valueOf;
        int i = this.b;
        int i2 = i - this.c;
        int i3 = i - this.d;
        a.Companion.getClass();
        a a2 = a.C1392a.a(i2);
        a a3 = a.C1392a.a(i3);
        int i4 = this.c;
        ProgressBar progressBar = this.f;
        progressBar.setProgress(i4);
        bwt0.d0(progressBar, i2 < 0);
        a aVar = a.NORMAL;
        boolean z = a2 == aVar;
        TextView textView = this.g;
        bwt0.d0(textView, z);
        int i5 = this.e;
        if (i2 < i5) {
            i2 = i5;
        }
        if (i2 < 0) {
            valueOf = "−" + Math.abs(i2);
        } else {
            valueOf = String.valueOf(i2);
        }
        textView.setText(valueOf);
        int i6 = b.$EnumSwitchMapping$0[a2.ordinal()];
        int i7 = this.i;
        pdc pdcVar = this.h;
        if (i6 == 1) {
            pdcVar.a(i7, this.j);
            pdcVar.invalidateSelf();
            return;
        }
        if (i6 == 2) {
            if (a3 == aVar) {
                performHapticFeedback(0);
            }
            pdcVar.a(i7, this.k);
            pdcVar.invalidateSelf();
            TypedValue typedValue = krv0.a;
            krv0.q(textView, R.attr.vk_ui_text_muted);
            return;
        }
        if (i6 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (a2 != a3) {
            performHapticFeedback(0);
        }
        int i8 = this.l;
        pdcVar.a(i7, i8);
        pdcVar.invalidateSelf();
        textView.setTextColor(i8);
    }

    public final int getCharacters() {
        return this.c;
    }

    public final int getLimit() {
        return this.b;
    }

    public final void setCharacters(int i) {
        this.d = this.c;
        this.c = i;
        a();
    }

    public final void setLimit(int i) {
        this.b = i;
        this.f.setMax(i);
        a();
    }
}
