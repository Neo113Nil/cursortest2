package com.zoho.livechat.android.modules.conversations.ui.fragments;

import Cf.f0;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.common.ui.activities.PreChatFormActivity;
import com.zoho.livechat.android.modules.common.ui.activities.SalesIQActivity;
import com.zoho.livechat.android.modules.conversations.ui.fragments.w;
import com.zoho.livechat.android.modules.conversations.ui.viewmodels.PreChatFormViewModel;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.ui.activities.ChatActivity;
import com.zoho.livechat.android.utils.AbstractC3945n;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.P;
import ie.EnumC4544a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m.AbstractActivityC5481c;
import m.AbstractC5479a;
import od.AbstractC5886l;
import og.AbstractC5891c;
import og.AbstractC5892d;
import rd.C6218a;
import xe.C6822a;
import zf.C6966g;

/* loaded from: classes4.dex */
public class w extends bg.f {

    /* renamed from: B, reason: collision with root package name */
    public List f43255B;

    /* renamed from: C, reason: collision with root package name */
    public Channel.Department f43256C;

    /* renamed from: D, reason: collision with root package name */
    public SalesIQChat f43257D;

    /* renamed from: H, reason: collision with root package name */
    public EnumC4544a f43261H;

    /* renamed from: I, reason: collision with root package name */
    public Bundle f43262I;

    /* renamed from: K, reason: collision with root package name */
    public PreChatFormViewModel f43264K;

    /* renamed from: O, reason: collision with root package name */
    public Channel.Department f43266O;

    /* renamed from: P, reason: collision with root package name */
    public String f43267P;

    /* renamed from: R, reason: collision with root package name */
    public i f43268R;

    /* renamed from: T, reason: collision with root package name */
    public Channel.Department f43269T;

    /* renamed from: T1, reason: collision with root package name */
    public TextWatcher f43270T1;

    /* renamed from: V, reason: collision with root package name */
    public EnumC4544a f43271V;

    /* renamed from: V1, reason: collision with root package name */
    public TextWatcher f43272V1;

    /* renamed from: W, reason: collision with root package name */
    public Function0 f43273W;

    /* renamed from: X, reason: collision with root package name */
    public p f43274X;

    /* renamed from: Y, reason: collision with root package name */
    public r f43275Y;

    /* renamed from: Z, reason: collision with root package name */
    public j f43276Z;

    /* renamed from: b1, reason: collision with root package name */
    public h f43277b1;

    /* renamed from: b2, reason: collision with root package name */
    public pe.c f43278b2;

    /* renamed from: g1, reason: collision with root package name */
    public g f43279g1;

    /* renamed from: m, reason: collision with root package name */
    public RecyclerView f43281m;

    /* renamed from: n, reason: collision with root package name */
    public m f43282n;

    /* renamed from: o, reason: collision with root package name */
    public MaterialButton f43283o;

    /* renamed from: p, reason: collision with root package name */
    public CircularProgressIndicator f43284p;

    /* renamed from: p1, reason: collision with root package name */
    public i f43285p1;

    /* renamed from: p2, reason: collision with root package name */
    public TextWatcher f43286p2;

    /* renamed from: q, reason: collision with root package name */
    public CircularProgressIndicator f43287q;

    /* renamed from: r, reason: collision with root package name */
    public ConstraintLayout f43288r;

    /* renamed from: s, reason: collision with root package name */
    public Form.Message f43289s;

    /* renamed from: t, reason: collision with root package name */
    public Form.Message f43290t;

    /* renamed from: u, reason: collision with root package name */
    public Form.Message f43291u;

    /* renamed from: v, reason: collision with root package name */
    public String f43292v;

    /* renamed from: w, reason: collision with root package name */
    public String f43293w;

    /* renamed from: x, reason: collision with root package name */
    public String f43294x;

    /* renamed from: x1, reason: collision with root package name */
    public o f43295x1;

    /* renamed from: y, reason: collision with root package name */
    public String f43296y;

    /* renamed from: y1, reason: collision with root package name */
    public TextWatcher f43297y1;

    /* renamed from: z, reason: collision with root package name */
    public String f43298z;

    /* renamed from: A, reason: collision with root package name */
    public Boolean f43254A = null;

    /* renamed from: E, reason: collision with root package name */
    public boolean f43258E = false;

    /* renamed from: F, reason: collision with root package name */
    public boolean f43259F = false;

    /* renamed from: G, reason: collision with root package name */
    public boolean f43260G = false;

    /* renamed from: J, reason: collision with root package name */
    public final Handler f43263J = new Handler(Looper.getMainLooper());

    /* renamed from: L, reason: collision with root package name */
    public q f43265L = q.NONE;

    /* renamed from: g2, reason: collision with root package name */
    public ArrayList f43280g2 = new ArrayList();

    public class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f43299a;

        public a(p pVar) {
            this.f43299a = pVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (!this.f43299a.f43337b.hasFocus() || this.f43299a.f43336a.getError() == null) {
                return;
            }
            this.f43299a.b(false);
        }
    }

    public class b implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f43301a;

        public b(j jVar) {
            this.f43301a = jVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (!this.f43301a.f43318b.hasFocus() || this.f43301a.f43317a.getError() == null) {
                return;
            }
            this.f43301a.b(false);
        }
    }

    public class c implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f43303a;

        public c(r rVar) {
            this.f43303a = rVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (!this.f43303a.f43340b.hasFocus() || this.f43303a.f43339a.getError() == null) {
                return;
            }
            this.f43303a.b(false);
        }
    }

    public class d extends ClickableSpan {

        public class a extends ClickableSpan {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f43306a;

            public a(String str) {
                this.f43306a = str;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                LiveChatUtil.openUrl(this.f43306a);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(AbstractC5892d.f(w.this.getContext(), Integer.valueOf(AbstractC5886l.f59782W0)));
                textPaint.setUnderlineText(false);
            }
        }

        public d() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (w.this.getContext() == null) {
                return;
            }
            String chatConsentPolicyUrl = LiveChatUtil.getChatConsentPolicyUrl();
            String string = w.this.getString(od.t.f60965X);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            if (chatConsentPolicyUrl != null && !TextUtils.isEmpty(chatConsentPolicyUrl)) {
                String string2 = w.this.getString(od.t.f61033h0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) string2);
                spannableStringBuilder.setSpan(new a(chatConsentPolicyUrl), string.length() + 1, spannableStringBuilder.length(), 33);
            }
            qe.d.h(w.this.getContext(), w.this.getString(od.t.f60977Z), spannableStringBuilder, w.this.getString(od.t.f60971Y), null, null, null, null, null, null, null, true, true, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(P.e(w.this.getContext(), AbstractC5886l.f59782W0));
            textPaint.setUnderlineText(false);
        }
    }

    public class e implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f43308a;

        public e(o oVar) {
            this.f43308a = oVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null) {
                if (!qd.c.k()) {
                    rd.b.b();
                }
                w.this.f43298z = charSequence.toString();
            } else {
                w.this.f43298z = null;
            }
            if (!this.f43308a.f43334b.hasFocus() || this.f43308a.f43333a.getError() == null) {
                return;
            }
            this.f43308a.b(w.this.q1());
        }
    }

    public static /* synthetic */ class f {
        static final /* synthetic */ int[] $SwitchMap$com$zoho$livechat$android$modules$conversations$ui$fragments$PrechatFormFragment$FieldType;

        static {
            int[] iArr = new int[k.values().length];
            $SwitchMap$com$zoho$livechat$android$modules$conversations$ui$fragments$PrechatFormFragment$FieldType = iArr;
            try {
                iArr[k.Name.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$conversations$ui$fragments$PrechatFormFragment$FieldType[k.Email.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$conversations$ui$fragments$PrechatFormFragment$FieldType[k.Phone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$conversations$ui$fragments$PrechatFormFragment$FieldType[k.Department.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$conversations$ui$fragments$PrechatFormFragment$FieldType[k.Campaign.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$conversations$ui$fragments$PrechatFormFragment$FieldType[k.ChatConsent.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$conversations$ui$fragments$PrechatFormFragment$FieldType[k.Message.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class g extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public TextView f43310a;

        /* renamed from: b, reason: collision with root package name */
        public AppCompatCheckBox f43311b;

        public g(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(od.q.f60231D1);
            this.f43310a = textView;
            textView.setTypeface(C6218a.P());
            this.f43311b = (AppCompatCheckBox) view.findViewById(od.q.f60221C1);
            this.f43310a.setOnClickListener(new View.OnClickListener() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    w.g gVar = w.g.this;
                    gVar.f43311b.setChecked(!gVar.isChecked());
                }
            });
        }

        public void c(boolean z10) {
            if (z10) {
                this.f43310a.setAlpha(1.0f);
                this.f43311b.setAlpha(1.0f);
                this.f43311b.setEnabled(true);
            } else {
                this.f43310a.setAlpha(0.38f);
                this.f43311b.setAlpha(0.38f);
                this.f43311b.setEnabled(false);
            }
        }
    }

    public static class h extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public TextView f43312a;

        /* renamed from: b, reason: collision with root package name */
        public AppCompatCheckBox f43313b;

        public h(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(od.q.f60231D1);
            this.f43312a = textView;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            this.f43312a.setTypeface(C6218a.P());
            this.f43313b = (AppCompatCheckBox) view.findViewById(od.q.f60221C1);
            this.f43312a.setOnClickListener(new View.OnClickListener() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    w.h.b(w.h.this, view2);
                }
            });
        }

        public static /* synthetic */ void b(h hVar, View view) {
            if (hVar.f43312a.getSelectionStart() == -1 && hVar.f43312a.getSelectionEnd() == -1) {
                hVar.f43313b.setChecked(!r1.isChecked());
            }
        }

        public void c(boolean z10) {
            if (z10) {
                this.f43312a.setAlpha(1.0f);
                this.f43313b.setAlpha(1.0f);
                this.f43313b.setEnabled(true);
            } else {
                this.f43312a.setAlpha(0.38f);
                this.f43313b.setAlpha(0.38f);
                this.f43313b.setEnabled(false);
            }
        }
    }

    public class i extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public TextInputLayout f43314a;

        /* renamed from: b, reason: collision with root package name */
        public MaterialAutoCompleteTextView f43315b;

        public i(View view) {
            super(view);
            this.f43314a = (TextInputLayout) view.findViewById(od.q.f60428W8);
            MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) view.findViewById(od.q.f60652s5);
            this.f43315b = materialAutoCompleteTextView;
            materialAutoCompleteTextView.setTypeface(C6218a.P());
        }

        public void b(boolean z10) {
            if (!z10) {
                this.f43314a.setError(null);
            } else {
                TextInputLayout textInputLayout = this.f43314a;
                textInputLayout.setError(textInputLayout.getContext().getString(od.t.f61048j1));
            }
        }
    }

    public class j extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public TextInputLayout f43317a;

        /* renamed from: b, reason: collision with root package name */
        public TextInputEditText f43318b;

        public j(View view) {
            super(view);
            this.f43317a = (TextInputLayout) view.findViewById(od.q.f60428W8);
            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(od.q.f60722z5);
            this.f43318b = textInputEditText;
            textInputEditText.setTypeface(C6218a.P());
        }

        public void b(boolean z10) {
            if (z10) {
                this.f43317a.setError(this.f43318b.getContext().getString(od.t.f61062l1));
            } else {
                this.f43317a.setError(null);
            }
        }
    }

    public enum k {
        Name,
        Email,
        Phone,
        Department,
        Campaign,
        ChatConsent,
        Message
    }

    public static class l extends RecyclerView.p {

        /* renamed from: a, reason: collision with root package name */
        public final int f43320a;

        public l(int i10) {
            this.f43320a = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b10) {
            if (recyclerView.m0(view) == 0) {
                rect.top = this.f43320a;
            }
        }
    }

    public class m extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public List f43321a = new ArrayList();

        public class a extends h.b {

            /* renamed from: a, reason: collision with root package name */
            public final List f43323a;

            /* renamed from: b, reason: collision with root package name */
            public final List f43324b;

            public a(List list, List list2) {
                this.f43323a = list;
                this.f43324b = list2;
            }

            @Override // androidx.recyclerview.widget.h.b
            public boolean areContentsTheSame(int i10, int i11) {
                Pair pair = (Pair) this.f43323a.get(i10);
                Pair pair2 = (Pair) this.f43324b.get(i11);
                if (pair.getFirst() != pair2.getFirst()) {
                    return false;
                }
                if (pair.getSecond() != null && pair2.getSecond() != null && ((Form.Message) pair.getSecond()).getMeta() != null && ((Form.Message) pair2.getSecond()).getMeta() != null && ((Form.Message) pair.getSecond()).getMeta().getInputCard() != null && ((Form.Message) pair2.getSecond()).getMeta().getInputCard() != null && ((Form.Message) pair.getSecond()).getMeta().isSkippable() == ((Form.Message) pair2.getSecond()).getMeta().isSkippable() && Objects.equals(((Form.Message) pair.getSecond()).getMeta().getInputCard().getMaxLength(), ((Form.Message) pair2.getSecond()).getMeta().getInputCard().getMaxLength()) && Objects.equals(((Form.Message) pair.getSecond()).getMeta().getInputCard().getPlaceholder(), ((Form.Message) pair2.getSecond()).getMeta().getInputCard().getPlaceholder()) && Objects.equals(((Form.Message) pair.getSecond()).getText(), ((Form.Message) pair2.getSecond()).getText())) {
                    return true;
                }
                Object first = pair.getFirst();
                k kVar = k.Message;
                if (first == kVar && pair2.getFirst() == kVar) {
                    return true;
                }
                Object first2 = pair.getFirst();
                k kVar2 = k.Department;
                return first2 == kVar2 && pair2.getFirst() == kVar2;
            }

            @Override // androidx.recyclerview.widget.h.b
            public boolean areItemsTheSame(int i10, int i11) {
                return ((Pair) this.f43323a.get(i10)).getFirst() == ((Pair) this.f43324b.get(i11)).getFirst();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int getNewListSize() {
                return this.f43324b.size();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int getOldListSize() {
                return this.f43323a.size();
            }
        }

        public m() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String c(k kVar, RecyclerView.F f10) {
            Editable editable;
            if (f10 == null) {
                f10 = d(kVar);
            }
            if (f10 != null) {
                int i10 = f.$SwitchMap$com$zoho$livechat$android$modules$conversations$ui$fragments$PrechatFormFragment$FieldType[kVar.ordinal()];
                if (i10 == 1) {
                    editable = ((p) f10).f43337b.getText();
                } else if (i10 == 2) {
                    editable = ((j) f10).f43318b.getText();
                } else if (i10 == 3) {
                    editable = ((r) f10).f43340b.getText();
                } else if (i10 == 4) {
                    editable = ((i) f10).f43315b.getText();
                } else if (i10 == 7) {
                    editable = ((o) f10).f43334b.getText();
                }
                if (editable == null) {
                    return editable.toString();
                }
                return null;
            }
            editable = null;
            if (editable == null) {
            }
        }

        public RecyclerView.F d(k kVar) {
            switch (f.$SwitchMap$com$zoho$livechat$android$modules$conversations$ui$fragments$PrechatFormFragment$FieldType[kVar.ordinal()]) {
                case 1:
                    return w.this.f43274X;
                case 2:
                    return w.this.f43276Z;
                case 3:
                    return w.this.f43275Y;
                case 4:
                    return w.this.f43285p1;
                case 5:
                    return w.this.f43279g1;
                case 6:
                    return w.this.f43277b1;
                case 7:
                    return w.this.f43295x1;
                default:
                    return null;
            }
        }

        public void e(List list) {
            h.e b10 = androidx.recyclerview.widget.h.b(new a(this.f43321a, list));
            this.f43321a = list;
            b10.c(this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f43321a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i10) {
            return ((k) ((Pair) this.f43321a.get(i10)).getFirst()).ordinal();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.F f10, int i10) {
            Pair pair = (Pair) this.f43321a.get(i10);
            k kVar = (k) pair.getFirst();
            Form.Message message = (Form.Message) pair.getSecond();
            switch (f.$SwitchMap$com$zoho$livechat$android$modules$conversations$ui$fragments$PrechatFormFragment$FieldType[kVar.ordinal()]) {
                case 1:
                    w.this.S0((p) f10, message);
                    break;
                case 2:
                    w.this.Q0((j) f10, message);
                    break;
                case 3:
                    w.this.T0((r) f10, message);
                    break;
                case 4:
                    w.this.P0((i) f10, message);
                    break;
                case 5:
                    w.this.M0((g) f10, message);
                    break;
                case 6:
                    w.this.N0((h) f10);
                    break;
                case 7:
                    w.this.R0((o) f10);
                    break;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i10) {
            k kVar = k.values()[i10];
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            switch (f.$SwitchMap$com$zoho$livechat$android$modules$conversations$ui$fragments$PrechatFormFragment$FieldType[kVar.ordinal()]) {
                case 1:
                    p pVar = w.this.f43274X;
                    if (pVar != null) {
                        return pVar;
                    }
                    p pVar2 = w.this.new p(from.inflate(od.r.f60767V, viewGroup, false));
                    w.this.f43274X = pVar2;
                    return pVar2;
                case 2:
                    j jVar = w.this.f43276Z;
                    if (jVar != null) {
                        return jVar;
                    }
                    j jVar2 = w.this.new j(from.inflate(od.r.f60764T, viewGroup, false));
                    w.this.f43276Z = jVar2;
                    return jVar2;
                case 3:
                    r rVar = w.this.f43275Y;
                    if (rVar != null) {
                        return rVar;
                    }
                    r rVar2 = w.this.new r(from.inflate(od.r.f60768W, viewGroup, false));
                    w.this.f43275Y = rVar2;
                    return rVar2;
                case 4:
                    i iVar = w.this.f43285p1;
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar2 = w.this.new i(from.inflate(od.r.f60762S, viewGroup, false));
                    w.this.f43285p1 = iVar2;
                    return iVar2;
                case 5:
                    g gVar = w.this.f43279g1;
                    if (gVar != null) {
                        return gVar;
                    }
                    g gVar2 = new g(from.inflate(od.r.f60760R, viewGroup, false));
                    w.this.f43279g1 = gVar2;
                    return gVar2;
                case 6:
                    h hVar = w.this.f43277b1;
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar2 = new h(from.inflate(od.r.f60760R, viewGroup, false));
                    w.this.f43277b1 = hVar2;
                    return hVar2;
                case 7:
                    o oVar = w.this.f43295x1;
                    if (oVar != null) {
                        return oVar;
                    }
                    o oVar2 = w.this.new o(from.inflate(od.r.f60766U, viewGroup, false));
                    w.this.f43295x1 = oVar2;
                    return oVar2;
                default:
                    return null;
            }
        }
    }

    public static class n {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f43326a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f43327b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f43328c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f43329d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f43330e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f43331f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f43332g;

        public n(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
            this.f43326a = z10;
            this.f43327b = z11;
            this.f43328c = z12;
            this.f43329d = z13;
            this.f43330e = z14;
            this.f43331f = z15;
            this.f43332g = z16;
        }

        public boolean b() {
            return this.f43327b;
        }

        public boolean c() {
            return this.f43331f;
        }

        public boolean d() {
            return this.f43329d;
        }

        public boolean e() {
            return this.f43332g;
        }

        public boolean f() {
            return this.f43328c;
        }

        public boolean g() {
            return this.f43330e;
        }

        public boolean h() {
            return (this.f43328c || this.f43329d || this.f43330e || this.f43331f || this.f43332g || this.f43326a) ? false : true;
        }
    }

    public class o extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public TextInputLayout f43333a;

        /* renamed from: b, reason: collision with root package name */
        public TextInputEditText f43334b;

        public o(View view) {
            super(view);
            this.f43333a = (TextInputLayout) view.findViewById(od.q.f60428W8);
            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(od.q.f60672u5);
            this.f43334b = textInputEditText;
            textInputEditText.setTypeface(C6218a.P());
        }

        public void b(boolean z10) {
            if (z10) {
                this.f43333a.setError(this.f43334b.getContext().getString(od.t.f61103r1));
            } else {
                this.f43333a.setError(null);
            }
        }
    }

    public class p extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public TextInputLayout f43336a;

        /* renamed from: b, reason: collision with root package name */
        public TextInputEditText f43337b;

        public p(View view) {
            super(view);
            this.f43336a = (TextInputLayout) view.findViewById(od.q.f60428W8);
            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(od.q.f60205A5);
            this.f43337b = textInputEditText;
            textInputEditText.setTypeface(C6218a.P());
        }

        public void b(boolean z10) {
            if (z10) {
                this.f43336a.setError(this.f43337b.getContext().getString(od.t.f61076n1));
            } else {
                this.f43336a.setError(null);
            }
        }
    }

    public enum q {
        NONE,
        SYNC_FOR_LOAD_FORM_FIELDS,
        SYNC_FOR_DEPARTMENT_CHANGE,
        INITIATE_NEW_CHAT,
        INITIATE_NEW_CHAT_CALL,
        LEAVE_AS_MISSED_AUDIO,
        LEAVE_AS_MISSED_CHAT,
        REOPEN_CHAT
    }

    public class r extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public TextInputLayout f43339a;

        /* renamed from: b, reason: collision with root package name */
        public TextInputEditText f43340b;

        public r(View view) {
            super(view);
            this.f43339a = (TextInputLayout) view.findViewById(od.q.f60428W8);
            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(od.q.f60215B5);
            this.f43340b = textInputEditText;
            textInputEditText.setTypeface(C6218a.P());
        }

        public void b(boolean z10) {
            if (z10) {
                this.f43339a.setError(this.f43340b.getContext().getString(od.t.f61090p1));
            } else {
                this.f43339a.setError(null);
            }
        }
    }

    public static /* synthetic */ Unit A0(i iVar) {
        LiveChatUtil.log("showDepartmentBottomSheet onShow");
        iVar.f43314a.setEndIconDrawable(od.p.f60084d);
        return null;
    }

    public static /* synthetic */ Unit B0(w wVar, Message message, ArrayList arrayList, Boolean bool) {
        wVar.f43258E = false;
        if (bool.booleanValue()) {
            wVar.O0();
            wVar.V0(wVar.f43257D, message, arrayList);
        }
        return Unit.INSTANCE;
    }

    private void d1() {
        this.f43258E = false;
        try {
            f1();
            X0(null, null);
            j1();
        } catch (Throwable th2) {
            LiveChatUtil.log(th2);
        }
    }

    public static /* synthetic */ void h0(w wVar, boolean z10) {
        if (z10) {
            wVar.f43281m.x1(0);
        }
        wVar.f43287q.j();
    }

    public static /* synthetic */ void j0(w wVar, AbstractActivityC2168s abstractActivityC2168s, Message message, ArrayList arrayList, DialogInterface dialogInterface, int i10) {
        wVar.f43258E = false;
        wVar.h1(true);
        wVar.O0();
        wVar.f43265L = q.LEAVE_AS_MISSED_CHAT;
        wVar.f43264K.y(abstractActivityC2168s, wVar.f43257D, message, arrayList, Pe.a.Chat);
    }

    public static /* synthetic */ void k0(final w wVar, Channel.Department department, String str) {
        boolean z10;
        Pair pair;
        SalesIQChat salesIQChat;
        SalesIQChat salesIQChat2;
        boolean z11 = (wVar.getContext() != null ? wVar.getContext() : MobilistenInitProvider.k()).getResources().getBoolean(od.m.f59919f);
        boolean z12 = true;
        EnumC4544a F02 = department != null ? wVar.F0(department.isOnline() == Boolean.TRUE) : wVar.f43261H;
        if (!C6822a.C(F02)) {
            wVar.f43264K.D(wVar.f43259F ? Md.a.Call : Md.a.Chat, F02);
            wVar.f43265L = q.SYNC_FOR_LOAD_FORM_FIELDS;
            wVar.f43266O = department;
            wVar.f43267P = str;
            return;
        }
        Form s10 = C6822a.s(F02);
        ArrayList arrayList = new ArrayList();
        if (s10 != null) {
            List<Form.Message> messages = s10.getMessages();
            if (messages != null) {
                boolean z13 = true;
                z10 = false;
                pair = null;
                for (Form.Message message : messages) {
                    if (!wVar.f43260G && message.getMeta() != null && message.getMeta().getInputCard() != null) {
                        Form.Message.Meta.InputCard.a type = message.getMeta().getInputCard().getType();
                        if (type != null) {
                            if (type == Form.Message.Meta.InputCard.a.VisitorName) {
                                wVar.f43289s = message;
                                arrayList.add(new Pair(k.Name, message));
                            } else if (type == Form.Message.Meta.InputCard.a.VisitorEmail) {
                                wVar.f43290t = message;
                                arrayList.add(new Pair(k.Email, message));
                            } else if (type == Form.Message.Meta.InputCard.a.VisitorPhone) {
                                wVar.f43291u = message;
                                arrayList.add(new Pair(k.Phone, message));
                            } else if (type == Form.Message.Meta.InputCard.a.Campaign) {
                                k kVar = k.Campaign;
                                pair = new Pair(kVar, message);
                                if (z11) {
                                    arrayList.add(new Pair(kVar, message));
                                }
                            }
                            z13 = false;
                        }
                    } else if (message.getMeta() != null && message.getMeta().getSuggestions() != null) {
                        List H02 = wVar.H0(wVar.f43257D, wVar.G0());
                        if (!wVar.f43260G && wVar.f43285p1 == null && (salesIQChat2 = wVar.f43257D) != null && salesIQChat2.getDepartmentName() != null) {
                            int size = H02.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                Channel.Department department2 = (Channel.Department) H02.get(i10);
                                if (wVar.f43257D.getDepartmentName().equalsIgnoreCase(department2.getName())) {
                                    wVar.f43256C = department2;
                                }
                            }
                            if (wVar.f43256C == null) {
                                if (H02.size() > 1) {
                                    arrayList.add(new Pair(k.Department, message));
                                    z13 = false;
                                } else if (H02.size() == 1) {
                                    wVar.f43256C = (Channel.Department) H02.get(0);
                                }
                            }
                        } else if (H02.size() > 1) {
                            arrayList.add(new Pair(k.Department, message));
                            z10 = true;
                            z13 = false;
                        } else if (wVar.f43285p1 == null && H02.size() == 1) {
                            wVar.f43256C = (Channel.Department) H02.get(0);
                        }
                        z10 = true;
                    }
                }
                z12 = z13;
            } else {
                z10 = false;
                pair = null;
            }
            if (wVar.f43260G || wVar.f43259F || (salesIQChat = wVar.f43257D) == null ? !wVar.f43259F && str == null : C6966g.R(salesIQChat.getConvID()) == null) {
                arrayList.add(new Pair(k.Message, null));
                z12 = false;
            }
            if (pair != null && !z11) {
                arrayList.add(pair);
            }
            if (LiveChatUtil.requireChatGDPRConsent()) {
                arrayList.add(new Pair(k.ChatConsent, null));
                z12 = false;
            }
            if (!z10) {
                List H03 = wVar.H0(wVar.f43257D, wVar.G0());
                if (!H03.isEmpty()) {
                    wVar.f43256C = (Channel.Department) H03.get(0);
                }
            }
            if (z12) {
                wVar.f43263J.post(new Runnable() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.this.U0();
                    }
                });
            }
        } else {
            if (!(r1 = wVar.f43259F)) {
            }
            z12 = false;
            if (!z12) {
                arrayList.add(new Pair(k.Message, null));
            }
            if (z12 && C6822a.C(F02)) {
                wVar.f43263J.post(new Runnable() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.this.U0();
                    }
                });
            }
        }
        wVar.f43283o.setOnClickListener(new View.OnClickListener() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.this.U0();
            }
        });
        wVar.p1(arrayList);
    }

    public static /* synthetic */ Unit m0(w wVar, PreChatFormViewModel.a.h hVar, Boolean bool) {
        wVar.getClass();
        if (bool.booleanValue()) {
            wVar.f43264K.v(hVar.a(), hVar.d(), hVar.c(), hVar.b());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void n0(final w wVar, List list) {
        final boolean z10 = ((LinearLayoutManager) wVar.f43281m.getLayoutManager()).j2() == 0;
        wVar.f43282n.e(list);
        wVar.f43263J.post(new Runnable() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.l
            @Override // java.lang.Runnable
            public final void run() {
                w.h0(w.this, z10);
            }
        });
    }

    public static /* synthetic */ Unit o0(i iVar) {
        iVar.f43315b.clearFocus();
        LiveChatUtil.log("showDepartmentBottomSheet onDismiss");
        iVar.f43314a.setEndIconDrawable(od.p.f60079c);
        return null;
    }

    public static /* synthetic */ void p0(w wVar, i iVar, View view, boolean z10) {
        if (z10) {
            wVar.o1(iVar);
        } else {
            wVar.getClass();
        }
    }

    public static /* synthetic */ Boolean q0(w wVar, Channel.Department department) {
        wVar.getClass();
        return Boolean.valueOf(department.getId() != null && department.getId().equals(wVar.f43256C.getId()));
    }

    public static /* synthetic */ Unit s0(w wVar, AbstractActivityC2168s abstractActivityC2168s, Message message, ArrayList arrayList, Boolean bool) {
        wVar.getClass();
        wVar.f43258E = bool.booleanValue();
        if (bool.booleanValue()) {
            wVar.O0();
            wVar.h1(true);
            wVar.f43265L = q.LEAVE_AS_MISSED_AUDIO;
            wVar.f43264K.y(abstractActivityC2168s, wVar.f43257D, message, arrayList, Pe.a.Audio);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit t0(final w wVar, PreChatFormViewModel.a aVar) {
        Channel.Department department;
        if (!wVar.isAdded()) {
            return Unit.INSTANCE;
        }
        AbstractActivityC2168s activity = wVar.getActivity();
        if (aVar instanceof PreChatFormViewModel.a.i) {
            boolean a10 = ((PreChatFormViewModel.a.i) aVar).a();
            q qVar = wVar.f43265L;
            if (qVar == q.SYNC_FOR_LOAD_FORM_FIELDS) {
                wVar.f43265L = q.NONE;
                if (a10) {
                    wVar.X0(wVar.f43266O, wVar.f43267P);
                }
            } else if (qVar == q.SYNC_FOR_DEPARTMENT_CHANGE) {
                wVar.f43265L = q.NONE;
                wVar.f43280g2.add(wVar.f43271V);
                wVar.f43261H = wVar.f43271V;
                i iVar = wVar.f43268R;
                if (iVar != null && (department = wVar.f43269T) != null) {
                    wVar.b1(iVar, department);
                }
                Function0 function0 = wVar.f43273W;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        } else {
            if (aVar instanceof PreChatFormViewModel.a.c) {
                PreChatFormViewModel.a.c cVar = (PreChatFormViewModel.a.c) aVar;
                wVar.f43265L = q.NONE;
                if (cVar.c()) {
                    wVar.W0(cVar.a());
                } else {
                    if (cVar.b() != null) {
                        MobilistenUtil.p(wVar.f43281m, wVar.f43283o, cVar.b().intValue());
                    }
                    wVar.f43258E = false;
                    wVar.d1();
                    wVar.h1(false);
                }
            } else if (aVar instanceof PreChatFormViewModel.a.b) {
                SalesIQChat a11 = ((PreChatFormViewModel.a.b) aVar).a();
                wVar.f43265L = q.NONE;
                if (a11 != null) {
                    wVar.c1();
                    Bundle bundle = wVar.f43262I;
                    if (bundle != null && activity != null && bundle.getBoolean("can_finish_activity_on_call")) {
                        activity.finish();
                    }
                } else {
                    wVar.d1();
                    wVar.h1(false);
                }
            } else if (aVar instanceof PreChatFormViewModel.a.d) {
                SalesIQChat a12 = ((PreChatFormViewModel.a.d) aVar).a();
                q qVar2 = wVar.f43265L;
                if (qVar2 == q.LEAVE_AS_MISSED_AUDIO) {
                    wVar.f43265L = q.NONE;
                    if (a12 != null) {
                        wVar.E0(activity);
                    } else {
                        Channel.Department department2 = (Channel.Department) AbstractC5891c.c(Td.e.Z(), new Function1() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return w.q0(w.this, (Channel.Department) obj);
                            }
                        });
                        if (department2 != null) {
                            Boolean isOnline = department2.isOnline();
                            Boolean bool = Boolean.TRUE;
                            if (isOnline == bool) {
                                MobilistenUtil.p(wVar.f43281m, wVar.f43283o, od.t.f60850D4);
                            }
                            wVar.f43256C = department2;
                            wVar.f43261H = wVar.F0(department2.isOnline() == bool);
                        }
                        wVar.d1();
                        wVar.h1(false);
                    }
                } else if (qVar2 == q.LEAVE_AS_MISSED_CHAT) {
                    wVar.f43265L = q.NONE;
                    if (a12 == null) {
                        wVar.f43258E = false;
                        wVar.h1(false);
                        SalesIQChat salesIQChat = wVar.f43257D;
                        Channel.Department e10 = AbstractC3945n.e(salesIQChat != null ? salesIQChat.getDeptid() : null);
                        if (e10 != null) {
                            wVar.f43256C = e10;
                            Boolean isOnline2 = e10.isOnline();
                            Boolean bool2 = Boolean.TRUE;
                            if (isOnline2 == bool2) {
                                MobilistenUtil.p(wVar.f43281m, wVar.f43283o, od.t.f60850D4);
                            }
                            wVar.f43261H = wVar.F0(e10.isOnline() == bool2);
                            wVar.f1();
                            wVar.X0(e10, null);
                            wVar.j1();
                        }
                    } else if (a12.getStatus() == 3) {
                        wVar.E0(activity);
                    } else {
                        wVar.W0(a12);
                    }
                }
            } else if (aVar instanceof PreChatFormViewModel.a.e) {
                MobilistenUtil.p(wVar.f43281m, wVar.f43283o, ((PreChatFormViewModel.a.e) aVar).a());
                wVar.d1();
                wVar.h1(false);
            } else if (aVar instanceof PreChatFormViewModel.a.h) {
                final PreChatFormViewModel.a.h hVar = (PreChatFormViewModel.a.h) aVar;
                Td.e.y0(hVar.a(), new Function1() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w.m0(w.this, hVar, (Boolean) obj);
                    }
                });
            } else if (aVar instanceof PreChatFormViewModel.a.f) {
                wVar.f43265L = q.NONE;
                if (((PreChatFormViewModel.a.f) aVar).a()) {
                    wVar.getParentFragmentManager().A1("chat_fragment_result_listener", wVar.f43262I);
                    wVar.c1();
                } else {
                    wVar.d1();
                    wVar.h1(false);
                }
            } else if (aVar instanceof PreChatFormViewModel.a.g) {
                wVar.f43265L = q.NONE;
                wVar.f43256C = null;
                SalesIQChat salesIQChat2 = wVar.f43257D;
                if (salesIQChat2 != null) {
                    salesIQChat2.setDeptid(null);
                    wVar.f43257D.setDepartmentName(null);
                }
                MobilistenUtil.p(wVar.f43281m, wVar.f43283o, od.t.f60928Q4);
                wVar.d1();
                wVar.h1(false);
                wVar.f43285p1.f43315b.setText((CharSequence) null);
            } else if (aVar instanceof PreChatFormViewModel.a.C0625a) {
                wVar.f43265L = q.NONE;
                wVar.f43256C = null;
                SalesIQChat salesIQChat3 = wVar.f43257D;
                if (salesIQChat3 != null) {
                    salesIQChat3.setDeptid(null);
                    wVar.f43257D.setDepartmentName(null);
                }
                MobilistenUtil.p(wVar.f43281m, wVar.f43283o, od.t.f60934R4);
                wVar.d1();
                wVar.h1(false);
                wVar.f43285p1.f43315b.setText((CharSequence) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit w0(w wVar, String str, SpannableStringBuilder spannableStringBuilder) {
        wVar.getClass();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append(" ");
        spannableStringBuilder.append("*", new ForegroundColorSpan(AbstractC5892d.f(wVar.getContext(), Integer.valueOf(AbstractC5886l.f59820e2))), 33);
        return null;
    }

    public static /* synthetic */ Unit x0(w wVar, i iVar, Channel.Department department, Function0 function0) {
        EnumC4544a enumC4544a;
        EnumC4544a enumC4544a2;
        wVar.getClass();
        if (department == null) {
            function0.invoke();
            return null;
        }
        Boolean isOnline = department.isOnline();
        Boolean bool = Boolean.TRUE;
        boolean z10 = isOnline != bool ? !((enumC4544a = wVar.f43261H) == EnumC4544a.Offline || enumC4544a == EnumC4544a.CallOffline) : !((enumC4544a2 = wVar.f43261H) == EnumC4544a.Online || enumC4544a2 == EnumC4544a.CallOnline);
        EnumC4544a F02 = wVar.F0(department.isOnline() == bool);
        if (!z10) {
            wVar.f43261H = F02;
            wVar.b1(iVar, department);
            function0.invoke();
            return null;
        }
        if (wVar.f43280g2.contains(F02)) {
            wVar.f43261H = F02;
            wVar.b1(iVar, department);
            function0.invoke();
            return null;
        }
        Md.a aVar = wVar.f43259F ? Md.a.Call : Md.a.Chat;
        wVar.f43265L = q.SYNC_FOR_DEPARTMENT_CHANGE;
        wVar.f43268R = iVar;
        wVar.f43269T = department;
        wVar.f43271V = F02;
        wVar.f43273W = function0;
        wVar.f43264K.D(aVar, F02);
        return null;
    }

    public static /* synthetic */ void y0(View view) {
    }

    public static /* synthetic */ void z0(w wVar, i iVar, View view) {
        wVar.getClass();
        if (iVar.f43314a.hasFocus() || iVar.f43315b.hasFocus()) {
            wVar.o1(iVar);
        } else {
            iVar.f43314a.requestFocus();
        }
    }

    public final void E0(AbstractActivityC2168s abstractActivityC2168s) {
        Bundle bundle = this.f43262I;
        if (bundle != null) {
            if (!bundle.getBoolean("can_finish_activity_on_call") && !(abstractActivityC2168s instanceof ChatActivity)) {
                c1();
            } else if (abstractActivityC2168s != null) {
                abstractActivityC2168s.finish();
            }
        }
    }

    public EnumC4544a F0(boolean z10) {
        return this.f43259F ? z10 ? EnumC4544a.CallOnline : EnumC4544a.CallOffline : z10 ? EnumC4544a.Online : EnumC4544a.Offline;
    }

    public final String G0() {
        if (this.f43262I.getString("department_id") != null) {
            return this.f43262I.getString("department_id");
        }
        return null;
    }

    public final List H0(SalesIQChat salesIQChat, String str) {
        List list = this.f43255B;
        if (list != null && !list.isEmpty()) {
            return this.f43255B;
        }
        if (this.f43259F) {
            return Td.e.Z();
        }
        return AbstractC3945n.i(salesIQChat != null && salesIQChat.isTriggeredChat(), str, salesIQChat != null ? salesIQChat.getConvID() : null);
    }

    public final n I0() {
        boolean requireChatGDPRConsent = LiveChatUtil.requireChatGDPRConsent();
        boolean z10 = !requireChatGDPRConsent;
        boolean m12 = m1();
        boolean l12 = l1();
        boolean n12 = n1();
        RecyclerView.F d10 = this.f43282n.d(k.Campaign);
        boolean isChecked = d10 instanceof g ? ((g) d10).f43311b.isChecked() : false;
        RecyclerView.F d11 = this.f43282n.d(k.ChatConsent);
        if (requireChatGDPRConsent && (d11 instanceof h)) {
            z10 = ((h) d11).f43313b.isChecked();
        }
        return new n(z10, isChecked, m12, l12, n12, k1(), q1());
    }

    public final SpannedString J0(final String str) {
        return w0.n.a(new Function1() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w.w0(w.this, str, (SpannableStringBuilder) obj);
            }
        });
    }

    public final Bundle K0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        Bundle bundle = new Bundle();
        setArguments(bundle);
        return bundle;
    }

    public String L0() {
        return getArguments().getString("question", null);
    }

    public void M0(g gVar, Form.Message message) {
        if (message == null || !og.i.f(message.getText())) {
            gVar.f43310a.setText(od.t.f61041i1);
        } else {
            gVar.f43310a.setText(message.getText());
        }
        Boolean bool = this.f43254A;
        if (bool != null) {
            gVar.f43311b.setChecked(bool.booleanValue());
        }
    }

    public void N0(h hVar) {
        String string = getString(od.t.f61073m5);
        String string2 = getString(od.t.f61066l5, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new d(), string2.indexOf(string), spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append("*", new ForegroundColorSpan(AbstractC5892d.f(getContext(), Integer.valueOf(AbstractC5886l.f59820e2))), 33);
        hVar.f43312a.setText(spannableStringBuilder);
    }

    public final void O0() {
        Ye.d.o(De.a.ConversationConsentAccepted, true).a();
        SalesIQChat salesIQChat = this.f43257D;
        if (salesIQChat != null) {
            salesIQChat.setQuestion(this.f43296y);
            this.f43257D.setDeptid(this.f43256C.getId());
            this.f43257D.setDepartmentName(this.f43256C.getName());
        }
    }

    public void P0(final i iVar, Form.Message message) {
        iVar.f43314a.setError(null);
        iVar.f43315b.setTextColor(P.e(getContext(), AbstractC5886l.f59815d2));
        iVar.f43314a.setHint(od.t.f61055k1);
        iVar.f43314a.setEndIconMode(-1);
        iVar.f43314a.setEndIconDrawable(od.p.f60079c);
        if (message.getMeta() != null && message.getMeta().isSkippable() == Boolean.FALSE) {
            Y0(iVar.f43314a, getString(od.t.f61055k1));
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                w.p0(w.this, iVar, view, z10);
            }
        };
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.z0(w.this, iVar, view);
            }
        };
        iVar.f43315b.setOnClickListener(onClickListener);
        iVar.f43315b.setOnFocusChangeListener(onFocusChangeListener);
        iVar.f43314a.setOnFocusChangeListener(onFocusChangeListener);
        iVar.f43314a.setEndIconOnClickListener(onClickListener);
        iVar.f43314a.setOnClickListener(onClickListener);
        Channel.Department department = this.f43256C;
        if (department != null) {
            a1(iVar, department);
        }
    }

    public void Q0(j jVar, Form.Message message) {
        if (this.f43270T1 == null) {
            b bVar = new b(jVar);
            this.f43270T1 = bVar;
            jVar.f43318b.addTextChangedListener(bVar);
        }
        Form.Message.Meta meta = message.getMeta();
        String string = getString(od.t.f61069m1);
        if (meta != null && meta.getInputCard() != null) {
            if (meta.getInputCard().getMaxLength() != null) {
                jVar.f43318b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(meta.getInputCard().getMaxLength().intValue())});
            }
            if (og.i.f(meta.getInputCard().getPlaceholder())) {
                string = meta.getInputCard().getPlaceholder();
            }
        }
        jVar.f43317a.setError(null);
        jVar.f43318b.setTextColor(P.e(getContext(), AbstractC5886l.f59815d2));
        jVar.f43317a.setHint(string);
        if (message.getMeta() != null && message.getMeta().isSkippable() == Boolean.FALSE) {
            Y0(jVar.f43317a, string);
        }
        String k10 = Ye.d.k(De.a.VisitorEmail);
        if (k10 != null) {
            jVar.f43318b.setText(k10);
            TextInputEditText textInputEditText = jVar.f43318b;
            textInputEditText.setSelection(textInputEditText.getText().toString().length());
            this.f43293w = k10;
            return;
        }
        String str = this.f43293w;
        if (str != null) {
            jVar.f43318b.setText(str);
            TextInputEditText textInputEditText2 = jVar.f43318b;
            textInputEditText2.setSelection(textInputEditText2.getText().toString().length());
        }
    }

    public void R0(o oVar) {
        if (this.f43286p2 == null) {
            e eVar = new e(oVar);
            this.f43286p2 = eVar;
            oVar.f43334b.addTextChangedListener(eVar);
        }
        oVar.b(false);
        oVar.f43334b.setTextColor(P.e(getContext(), AbstractC5886l.f59815d2));
        oVar.f43334b.setText(this.f43298z);
        if (getArguments() != null) {
            String L02 = L0();
            if (L02 == null) {
                L02 = ZohoLiveChat.e.f();
            }
            if (L02 == null && getArguments().getString("chat_id", null) == null) {
                return;
            }
            TextInputEditText textInputEditText = oVar.f43334b;
            if (L02 == null) {
                L02 = LiveChatUtil.getChat(getArguments().getString("chat_id", null)).getQuestion();
            }
            textInputEditText.setText(L02);
            TextInputEditText textInputEditText2 = oVar.f43334b;
            textInputEditText2.setSelection(textInputEditText2.getText().length());
        }
    }

    public void S0(p pVar, Form.Message message) {
        if (this.f43297y1 == null) {
            a aVar = new a(pVar);
            this.f43297y1 = aVar;
            pVar.f43337b.addTextChangedListener(aVar);
        }
        Form.Message.Meta meta = message.getMeta();
        String string = getString(od.t.f61083o1);
        if (meta != null && meta.getInputCard() != null) {
            if (meta.getInputCard().getMaxLength() != null) {
                pVar.f43337b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(meta.getInputCard().getMaxLength().intValue())});
            }
            if (og.i.f(meta.getInputCard().getPlaceholder())) {
                string = meta.getInputCard().getPlaceholder();
            }
        }
        pVar.f43336a.setError(null);
        pVar.f43337b.setTextColor(P.e(getContext(), AbstractC5886l.f59815d2));
        pVar.f43336a.setHint(string);
        if (message.getMeta() != null && message.getMeta().isSkippable() == Boolean.FALSE) {
            Y0(pVar.f43336a, string);
        }
        String k10 = Ye.d.k(De.a.VisitorName);
        String str = LiveChatUtil.isAnnonVisitorbyName(k10) ? null : k10;
        if (str != null) {
            pVar.f43337b.setText(str);
            TextInputEditText textInputEditText = pVar.f43337b;
            textInputEditText.setSelection(textInputEditText.getText().toString().length());
            this.f43292v = str;
        } else {
            String str2 = this.f43292v;
            if (str2 != null) {
                pVar.f43337b.setText(str2);
                TextInputEditText textInputEditText2 = pVar.f43337b;
                textInputEditText2.setSelection(textInputEditText2.getText().toString().length());
            }
        }
        i1(pVar.f43336a, !Ed.a.x());
    }

    public void T0(r rVar, Form.Message message) {
        if (this.f43272V1 == null) {
            c cVar = new c(rVar);
            this.f43272V1 = cVar;
            rVar.f43340b.addTextChangedListener(cVar);
        }
        Form.Message.Meta meta = message.getMeta();
        String string = getString(od.t.f61097q1);
        if (meta != null && meta.getInputCard() != null) {
            if (meta.getInputCard().getMaxLength() != null) {
                rVar.f43340b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(meta.getInputCard().getMaxLength().intValue())});
            }
            if (og.i.f(meta.getInputCard().getPlaceholder())) {
                string = meta.getInputCard().getPlaceholder();
            }
        }
        rVar.f43339a.setError(null);
        rVar.f43340b.setTextColor(P.e(getContext(), AbstractC5886l.f59815d2));
        rVar.f43339a.setHint(string);
        if (message.getMeta() != null && message.getMeta().isSkippable() == Boolean.FALSE) {
            Y0(rVar.f43339a, string);
        }
        String k10 = Ye.d.k(De.a.VisitorPhone);
        if (k10 != null) {
            rVar.f43340b.setText(k10);
            TextInputEditText textInputEditText = rVar.f43340b;
            textInputEditText.setSelection(textInputEditText.getText().toString().length());
            this.f43294x = k10;
            return;
        }
        String str = this.f43294x;
        if (str != null) {
            rVar.f43340b.setText(str);
            TextInputEditText textInputEditText2 = rVar.f43340b;
            textInputEditText2.setSelection(textInputEditText2.getText().toString().length());
        }
    }

    public void U0() {
        Channel.Department department;
        SalesIQChat salesIQChat;
        String str;
        n I02 = I0();
        if (I02.f() || I02.d() || I02.g() || I02.c() || I02.e() || !I02.f43326a) {
            e1(I02);
        } else {
            final Message message = null;
            if (!this.f43258E) {
                Bundle K02 = K0();
                Ge.h j10 = Ye.d.j();
                String str2 = this.f43292v;
                if (str2 != null && !str2.trim().isEmpty()) {
                    j10.h(De.a.VisitorName, this.f43292v);
                }
                String str3 = this.f43293w;
                if (str3 != null && !str3.trim().isEmpty()) {
                    j10.h(De.a.VisitorEmail, this.f43293w);
                }
                String str4 = this.f43294x;
                if (str4 != null && !str4.trim().isEmpty()) {
                    j10.h(De.a.VisitorPhone, this.f43294x);
                }
                j10.e(De.a.IsCampaignSuggestionsSubscribed, I02.b()).b(true);
                if (this.f43259F && ((str = this.f43296y) == null || str.isEmpty())) {
                    int i10 = od.t.f60879I3;
                    String str5 = this.f43292v;
                    this.f43296y = getString(i10, (str5 == null || str5.isEmpty()) ? LiveChatUtil.getVisitorName() : this.f43292v);
                }
                String string = K02 != null ? K02.getString("chid") : null;
                SalesIQChat chat = LiveChatUtil.getChat(string);
                if (chat == null) {
                    String string2 = getArguments() != null ? getArguments().getString("acknowledgement_key") : null;
                    if (string2 == null) {
                        string2 = UUID.randomUUID().toString();
                    }
                    String str6 = string2;
                    if (K02 != null) {
                        K02.putString("convID", str6);
                    }
                    Pe.b I10 = Te.a.I(str6);
                    SalesIQChat.Extras extras = I10 != null ? new SalesIQChat.Extras(new SalesIQChat.Extras.a(I10.i(), I10.c(), I10.g(), I10.d())) : null;
                    SalesIQChat salesIQChat2 = new SalesIQChat(str6, string, null, rd.b.f(), 1, this.f43259F ? SalesIQChat.c.Call : SalesIQChat.c.Chat);
                    salesIQChat2.setExtras(extras);
                    salesIQChat = salesIQChat2;
                } else {
                    salesIQChat = chat;
                }
                if (salesIQChat.getStatus() == 7) {
                    if (K02 == null) {
                        K02 = new Bundle();
                    }
                    K02.putBoolean("join_proactive_chat", true);
                }
                salesIQChat.setLastmsgtime(rd.b.f());
                if ((K02 == null || !K02.getBoolean("is_inline_form")) && (this.f43296y != null || (getArguments() != null && getArguments().getBoolean("is_from_start_chat")))) {
                    long f10 = rd.b.f() + 1;
                    String str7 = this.f43296y;
                    message = C6966g.O(salesIQChat, (str7 == null || str7.isEmpty()) ? salesIQChat.getQuestion() : this.f43296y, Long.valueOf(f10), LiveChatUtil.getAnnonID(), LiveChatUtil.getVisitorName(), "", Message.g.Question, Message.f.Sending);
                }
                LiveChatUtil.setFormContextCompleted();
                LiveChatUtil.setStartChatDisabled();
                this.f43257D = salesIQChat;
                this.f43258E = true;
            }
            final AbstractActivityC2168s activity = getActivity();
            final ArrayList arrayList = new ArrayList();
            String str8 = this.f43292v;
            if (str8 != null && !str8.isEmpty()) {
                arrayList.add(Form.Message.Meta.InputCard.a.VisitorName);
            }
            String str9 = this.f43293w;
            if (str9 != null && !str9.isEmpty()) {
                arrayList.add(Form.Message.Meta.InputCard.a.VisitorEmail);
            }
            String str10 = this.f43294x;
            if (str10 != null && !str10.isEmpty()) {
                arrayList.add(Form.Message.Meta.InputCard.a.VisitorPhone);
            }
            if (this.f43282n.d(k.Campaign) != null) {
                arrayList.add(Form.Message.Meta.InputCard.a.Campaign);
            }
            if (this.f43262I.getBoolean("is_reopen_chat_form", false) && (department = this.f43256C) != null) {
                this.f43257D.setDeptid(department.getId());
                this.f43257D.setDepartmentName(this.f43256C.getName());
            }
            if (!C6218a.c0()) {
                MobilistenUtil.p(this.f43281m, this.f43283o, od.t.f61107s);
                return;
            }
            if (this.f43259F) {
                if (Td.e.m0()) {
                    this.f43258E = false;
                    MobilistenUtil.s(this.f43281m, this.f43283o, od.t.f60855E3);
                    return;
                }
                Channel.Department department2 = this.f43256C;
                if (department2 != null && activity != null) {
                    if (department2.isOnline() == Boolean.TRUE) {
                        Td.e.y0(activity, new Function1() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return w.B0(w.this, message, arrayList, (Boolean) obj);
                            }
                        });
                    } else {
                        Td.e.F0(activity, new Function1() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return w.s0(w.this, activity, message, arrayList, (Boolean) obj);
                            }
                        });
                    }
                }
            } else {
                if (getActivity() == null) {
                    this.f43258E = false;
                    LiveChatUtil.log("Activity is null");
                    return;
                }
                if (this.f43262I.getBoolean("is_reopen_chat_form", false)) {
                    O0();
                    h1(true);
                    SalesIQChat salesIQChat3 = this.f43257D;
                    if (salesIQChat3 == null || message == null) {
                        return;
                    }
                    this.f43265L = q.REOPEN_CHAT;
                    this.f43264K.A(salesIQChat3, message);
                    return;
                }
                if (this.f43262I.getBoolean("join_proactive_chat")) {
                    O0();
                    h1(true);
                    W0(this.f43257D);
                } else {
                    Channel.Department department3 = this.f43256C;
                    if (department3 != null) {
                        if (department3.isOnline() == Boolean.TRUE) {
                            h1(true);
                            O0();
                            this.f43265L = q.INITIATE_NEW_CHAT;
                            this.f43264K.w(activity, this.f43257D, message, arrayList);
                        } else {
                            qe.d.f(activity, getString(od.t.f60982Z4), getString(od.t.f60976Y4), getString(od.t.f60873H3), new DialogInterface.OnClickListener() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.j
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i11) {
                                    w.j0(w.this, activity, message, arrayList, dialogInterface, i11);
                                }
                            }, null, getString(od.t.f60867G3), new DialogInterface.OnClickListener() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.k
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i11) {
                                    w.this.f43258E = false;
                                }
                            });
                        }
                    }
                }
            }
        }
        LiveChatUtil.hideKeyboard(this.f43281m);
    }

    public void V0(SalesIQChat salesIQChat, Message message, List list) {
        h1(true);
        AbstractActivityC2168s activity = getActivity();
        if (activity != null) {
            this.f43265L = q.INITIATE_NEW_CHAT_CALL;
            this.f43264K.v(activity, salesIQChat, message, list);
        }
    }

    public final void W0(SalesIQChat salesIQChat) {
        try {
            if (og.i.h(getParentFragmentManager().C0(), new Function1() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(((Fragment) obj) instanceof f0);
                    return valueOf;
                }
            }) != null) {
                C6966g.j0(salesIQChat.getChid());
                this.f43262I.putString("chid", salesIQChat.getChid());
                this.f43262I.putString("acknowledgement_key", salesIQChat.getConvID());
                getParentFragmentManager().A1("chat_fragment_result_listener", this.f43262I);
                c1();
                return;
            }
            if (!(getActivity() instanceof SalesIQActivity) && (salesIQChat == null || salesIQChat.getType() != SalesIQChat.c.Chat || !(getActivity() instanceof PreChatFormActivity))) {
                f0 f0Var = new f0();
                if (salesIQChat != null && salesIQChat.getChid() != null) {
                    this.f43262I.putString("chid", salesIQChat.getChid());
                }
                f0Var.setArguments(this.f43262I);
                h1(false);
                c1();
                getParentFragmentManager().s().p(od.q.f60627q0, f0Var, f0.class.getName()).x(4100).h();
                LiveChatUtil.triggerChatListener("CHATVIEW_OPEN", salesIQChat);
                return;
            }
            h1(false);
            Intent intent = new Intent(getActivity(), (Class<?>) ChatActivity.class);
            if (this.f43262I == null) {
                this.f43262I = new Bundle();
            }
            this.f43262I.putString("chid", salesIQChat.getChid());
            this.f43262I.putString("acknowledgement_key", salesIQChat.getConvID());
            intent.putExtras(this.f43262I);
            startActivity(intent);
            c1();
        } catch (Throwable th2) {
            LiveChatUtil.log(th2);
        }
    }

    public void X0(final Channel.Department department, final String str) {
        LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.q
            @Override // java.lang.Runnable
            public final void run() {
                w.k0(w.this, department, str);
            }
        });
    }

    public final void Y0(TextInputLayout textInputLayout, String str) {
        textInputLayout.setHint(J0(str));
    }

    public final void Z0() {
        this.f43264K.z(getViewLifecycleOwner(), new Function1() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w.t0(w.this, (PreChatFormViewModel.a) obj);
            }
        });
    }

    public void a1(i iVar, Channel.Department department) {
        iVar.f43314a.clearFocus();
        iVar.f43315b.clearFocus();
        this.f43256C = department;
        String unescapeHtml = LiveChatUtil.unescapeHtml(department.getName());
        if (unescapeHtml != null) {
            iVar.f43315b.setText(unescapeHtml);
        } else {
            iVar.f43315b.setText(department.getName());
        }
        iVar.b(false);
    }

    public final void b1(i iVar, Channel.Department department) {
        a1(iVar, department);
        X0(department, L0());
        j1();
    }

    public boolean c1() {
        try {
            return getParentFragmentManager().h1();
        } catch (Throwable th2) {
            LiveChatUtil.log(th2);
            return false;
        }
    }

    public final void e1(n nVar) {
        RecyclerView.F d10 = this.f43282n.d(k.Name);
        RecyclerView.F d11 = this.f43282n.d(k.Email);
        RecyclerView.F d12 = this.f43282n.d(k.Phone);
        RecyclerView.F d13 = this.f43282n.d(k.Department);
        RecyclerView.F d14 = this.f43282n.d(k.Message);
        RecyclerView.F d15 = this.f43282n.d(k.ChatConsent);
        if (d10 instanceof p) {
            ((p) d10).b(nVar.f());
        }
        if (d11 instanceof j) {
            ((j) d11).b(nVar.d());
        }
        if (d12 instanceof r) {
            ((r) d12).b(nVar.g());
        }
        if (d13 instanceof i) {
            ((i) d13).b(nVar.c());
        }
        if (d14 instanceof o) {
            ((o) d14).b(nVar.e());
        }
        if (nVar.h() && (d15 instanceof h)) {
            MobilistenUtil.s(this.f43281m, this.f43283o, od.t.f60960W0);
        }
    }

    public final void f1() {
        String str;
        if (this.f43257D != null) {
            String str2 = "chid";
            if (this.f43262I.getString("chid") == null) {
                str2 = "chat_id";
                if (this.f43262I.getString("chat_id") == null) {
                    str = null;
                    if (str != null || str.isEmpty()) {
                        this.f43257D = null;
                    }
                    if (!this.f43259F && this.f43282n.d(k.Message) != null) {
                        this.f43257D.setQuestion(null);
                    }
                    if (this.f43282n.d(k.Department) != null) {
                        this.f43257D.setDeptid(null);
                        this.f43257D.setDepartmentName(null);
                        return;
                    }
                    return;
                }
            }
            str = this.f43262I.getString(str2);
            if (str != null) {
            }
            this.f43257D = null;
        }
    }

    public final void g1(boolean z10) {
        RecyclerView.F d10 = this.f43282n.d(k.Name);
        RecyclerView.F d11 = this.f43282n.d(k.Email);
        RecyclerView.F d12 = this.f43282n.d(k.Phone);
        RecyclerView.F d13 = this.f43282n.d(k.Department);
        RecyclerView.F d14 = this.f43282n.d(k.Message);
        RecyclerView.F d15 = this.f43282n.d(k.Campaign);
        RecyclerView.F d16 = this.f43282n.d(k.ChatConsent);
        if (d10 instanceof p) {
            i1(((p) d10).f43336a, z10);
        }
        if (d11 instanceof j) {
            i1(((j) d11).f43317a, z10);
        }
        if (d12 instanceof r) {
            i1(((r) d12).f43339a, z10);
        }
        if (d13 instanceof i) {
            i1(((i) d13).f43314a, z10);
        }
        if (d14 instanceof o) {
            i1(((o) d14).f43333a, z10);
        }
        if (d15 instanceof g) {
            this.f43279g1.c(z10);
        }
        if (d16 instanceof h) {
            ((h) d16).c(z10);
        }
    }

    public final void h1(boolean z10) {
        this.f43283o.setEnabled(!z10);
        if (z10) {
            this.f43283o.setText("");
            this.f43284p.r();
            g1(false);
        } else {
            this.f43283o.setText(getString(od.t.f60865G1));
            this.f43284p.j();
            g1(!Ed.a.x());
        }
    }

    public final void i1(TextInputLayout textInputLayout, boolean z10) {
        textInputLayout.setEnabled(z10);
        if (getContext() != null) {
            if (z10) {
                textInputLayout.setAlpha(1.0f);
            } else {
                textInputLayout.setAlpha(0.38f);
            }
        }
    }

    public void j1() {
        AbstractC5479a supportActionBar;
        AbstractActivityC2168s activity = getActivity();
        if (activity == null || (supportActionBar = ((AbstractActivityC5481c) activity).getSupportActionBar()) == null) {
            return;
        }
        if (this.f43259F) {
            if (this.f43261H == EnumC4544a.CallOnline) {
                if (Td.e.Y() == null || Td.e.Y().isEmpty()) {
                    supportActionBar.C(od.t.f60963W3);
                    return;
                } else {
                    supportActionBar.D(Td.e.Y());
                    return;
                }
            }
            if (Td.e.X() == null || Td.e.X().isEmpty()) {
                supportActionBar.C(od.t.f60957V3);
                return;
            } else {
                supportActionBar.D(Td.e.X());
                return;
            }
        }
        if (this.f43261H == EnumC4544a.Online) {
            if (Te.a.e0() == null || Te.a.e0().isEmpty()) {
                supportActionBar.C(od.t.f61148y4);
                return;
            } else {
                supportActionBar.D(Te.a.e0());
                return;
            }
        }
        if (Te.a.d0() == null || Te.a.d0().isEmpty()) {
            supportActionBar.C(od.t.f61142x4);
        } else {
            supportActionBar.D(Te.a.d0());
        }
    }

    public final boolean k1() {
        return this.f43256C == null;
    }

    public final boolean l1() {
        String c10;
        m mVar = this.f43282n;
        k kVar = k.Email;
        RecyclerView.F d10 = mVar.d(kVar);
        boolean z10 = false;
        if (d10 != null && (c10 = this.f43282n.c(kVar, d10)) != null) {
            String trim = c10.trim();
            if ((!trim.isEmpty() || this.f43290t.getMeta() == null || this.f43290t.getMeta().isSkippable() != Boolean.TRUE) && !Patterns.EMAIL_ADDRESS.matcher(trim).matches()) {
                z10 = true;
            }
            if (Patterns.EMAIL_ADDRESS.matcher(trim).matches()) {
                this.f43293w = trim;
            }
        }
        return z10;
    }

    public final boolean m1() {
        String c10;
        m mVar = this.f43282n;
        k kVar = k.Name;
        RecyclerView.F d10 = mVar.d(kVar);
        if (d10 == null || (c10 = this.f43282n.c(kVar, d10)) == null) {
            return false;
        }
        String trim = c10.trim();
        if (!trim.isEmpty()) {
            this.f43292v = trim;
        }
        return trim.isEmpty() && this.f43289s.getMeta() != null && this.f43289s.getMeta().isSkippable() == Boolean.FALSE;
    }

    public final boolean n1() {
        String c10;
        m mVar = this.f43282n;
        k kVar = k.Phone;
        RecyclerView.F d10 = mVar.d(kVar);
        boolean z10 = false;
        if (d10 != null && (c10 = this.f43282n.c(kVar, d10)) != null) {
            String trim = c10.trim();
            if ((!trim.isEmpty() || this.f43291u.getMeta() == null || this.f43291u.getMeta().isSkippable() != Boolean.TRUE) && !Pattern.compile("((?:\\+?\\d{1,3}[-. ]*)?(?:[(]?\\d{3}[-. )]*\\d{3}[-. ]*\\d{4,5}(?: *x\\d+)?|\\d{8,11}))").matcher(trim).matches()) {
                z10 = true;
            }
            if (Pattern.compile("((?:\\+?\\d{1,3}[-. ]*)?(?:[(]?\\d{3}[-. )]*\\d{3}[-. ]*\\d{4,5}(?: *x\\d+)?|\\d{8,11}))").matcher(trim).matches()) {
                this.f43294x = trim;
            }
        }
        return z10;
    }

    public final void o1(final i iVar) {
        LiveChatUtil.hideKeyboard(iVar.f43315b);
        pe.c cVar = this.f43278b2;
        if (cVar == null || !cVar.isAdded()) {
            pe.c cVar2 = new pe.c(new Function2() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.x0(w.this, iVar, (Channel.Department) obj, (Function0) obj2);
                }
            });
            this.f43278b2 = cVar2;
            cVar2.p0(H0(this.f43257D, G0()));
            this.f43278b2.q0(getParentFragmentManager(), this.f43278b2.getClass().getName(), new Function0() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.A0(w.i.this);
                }
            }, new Function0() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.o0(w.i.this);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0073  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityCreated(Bundle bundle) {
        String str;
        String G02;
        List i10;
        List H02;
        SalesIQChat salesIQChat;
        super.onActivityCreated(bundle);
        setHasOptionsMenu(true);
        if (this.f43262I == null) {
            this.f43262I = K0();
        }
        String str2 = "chid";
        String str3 = null;
        if (this.f43262I.getString("chid") == null) {
            str2 = "chat_id";
            if (this.f43262I.getString("chat_id") == null) {
                str = null;
                Bundle bundle2 = this.f43262I;
                boolean z10 = false;
                this.f43259F = bundle2 == null && bundle2.getBoolean("requested_for_call_type_chat");
                Bundle bundle3 = this.f43262I;
                this.f43260G = bundle3 == null && bundle3.getBoolean("is_reopen_chat_form", false);
                if (str != null) {
                    this.f43257D = LiveChatUtil.getChat(str);
                }
                G02 = G0();
                String string = this.f43262I.getString("acknowledgement_key", null);
                Pe.b I10 = Te.a.I(string);
                if (this.f43259F) {
                    SalesIQChat salesIQChat2 = this.f43257D;
                    boolean z11 = salesIQChat2 != null && salesIQChat2.isTriggeredChat();
                    if (string == null) {
                        SalesIQChat salesIQChat3 = this.f43257D;
                        string = salesIQChat3 != null ? salesIQChat3.getConvID() : null;
                    }
                    i10 = AbstractC3945n.i(z11, G02, string);
                } else {
                    i10 = Td.e.Z();
                }
                List h10 = I10 == null ? I10.h(i10) : null;
                if ((G02 != null || G02.isEmpty()) && (I10 == null || h10 == null || h10.isEmpty())) {
                    if (!this.f43260G || (salesIQChat = this.f43257D) == null || salesIQChat.getDeptid() == null || this.f43257D.getDeptid().isEmpty()) {
                        H02 = H0(this.f43257D, G02);
                        if (H02 != null && H02.size() == 1) {
                            this.f43256C = (Channel.Department) H02.get(0);
                        }
                    } else {
                        this.f43256C = AbstractC3945n.e(this.f43257D.getDeptid());
                    }
                } else if (G02 != null && !G02.isEmpty()) {
                    this.f43256C = AbstractC3945n.e(G02);
                } else if (!h10.isEmpty()) {
                    this.f43255B = h10;
                    this.f43256C = null;
                }
                if (this.f43261H == null) {
                    if (this.f43256C != null) {
                        boolean z12 = this.f43259F;
                        SalesIQChat salesIQChat4 = this.f43257D;
                        this.f43261H = com.zoho.livechat.android.modules.brand.ui.helpers.a.r(z12, salesIQChat4 != null && salesIQChat4.isTriggeredChat(), Collections.singletonList(this.f43256C));
                    } else if (this.f43259F) {
                        SalesIQChat salesIQChat5 = this.f43257D;
                        if (salesIQChat5 != null && salesIQChat5.isTriggeredChat()) {
                            z10 = true;
                        }
                        this.f43261H = com.zoho.livechat.android.modules.brand.ui.helpers.a.r(true, z10, this.f43255B);
                    } else {
                        SalesIQChat salesIQChat6 = this.f43257D;
                        if (salesIQChat6 != null && salesIQChat6.getConvID() != null) {
                            str3 = this.f43257D.getConvID();
                        }
                        SalesIQChat salesIQChat7 = this.f43257D;
                        this.f43261H = com.zoho.livechat.android.modules.brand.ui.helpers.a.w(str3, G02, salesIQChat7 != null && salesIQChat7.isTriggeredChat());
                    }
                }
                if (getActivity() != null) {
                    getActivity().getWindow().setStatusBarColor(P.e(getActivity(), AbstractC5886l.f59830g2));
                }
                m mVar = new m();
                this.f43282n = mVar;
                this.f43281m.setAdapter(mVar);
                this.f43281m.setLayoutManager(new LinearLayoutManager(getContext()));
                X0(this.f43256C, L0());
            }
        }
        str = this.f43262I.getString(str2);
        Bundle bundle22 = this.f43262I;
        boolean z102 = false;
        this.f43259F = bundle22 == null && bundle22.getBoolean("requested_for_call_type_chat");
        Bundle bundle32 = this.f43262I;
        this.f43260G = bundle32 == null && bundle32.getBoolean("is_reopen_chat_form", false);
        if (str != null) {
        }
        G02 = G0();
        String string2 = this.f43262I.getString("acknowledgement_key", null);
        Pe.b I102 = Te.a.I(string2);
        if (this.f43259F) {
        }
        if (I102 == null) {
        }
        if (G02 != null) {
        }
        if (this.f43260G) {
        }
        H02 = H0(this.f43257D, G02);
        if (H02 != null) {
            this.f43256C = (Channel.Department) H02.get(0);
        }
        if (this.f43261H == null) {
        }
        if (getActivity() != null) {
        }
        m mVar2 = new m();
        this.f43282n = mVar2;
        this.f43281m.setAdapter(mVar2);
        this.f43281m.setLayoutManager(new LinearLayoutManager(getContext()));
        X0(this.f43256C, L0());
    }

    @Override // bg.f
    public boolean onBackPressed() {
        LiveChatUtil.hideKeyboard(getView());
        AbstractActivityC2168s activity = getActivity();
        boolean z10 = getActivity() != null;
        if (!(activity instanceof SalesIQActivity)) {
            return z10 && getActivity().getSupportFragmentManager().h1();
        }
        if (this.f43262I.getBoolean("can_finish_activity_on_call")) {
            activity.finish();
            return z10;
        }
        List C02 = activity.getSupportFragmentManager().C0();
        if (C02.isEmpty()) {
            return false;
        }
        return ((Fragment) C02.get(0)) instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a ? c1() : getActivity().getSupportFragmentManager().h1();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(od.r.f60732D, viewGroup, false);
        this.f43264K = (PreChatFormViewModel) new U(requireActivity()).a(PreChatFormViewModel.class);
        Z0();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(od.q.f60414V4);
        this.f43281m = recyclerView;
        recyclerView.j(new l(og.k.b(14)));
        this.f43288r = (ConstraintLayout) inflate.findViewById(od.q.f60246E6);
        this.f43283o = (MaterialButton) inflate.findViewById(od.q.f60501d8);
        this.f43284p = (CircularProgressIndicator) inflate.findViewById(od.q.f60424W4);
        this.f43287q = (CircularProgressIndicator) inflate.findViewById(od.q.f60256F6);
        this.f43288r.setOnClickListener(new View.OnClickListener() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.y0(view);
            }
        });
        if (!(getActivity() instanceof PreChatFormActivity)) {
            inflate.setBackgroundColor(AbstractC5892d.f(getActivity(), Integer.valueOf(AbstractC5886l.f59810c2)));
        }
        Bundle K02 = K0();
        this.f43262I = K02;
        this.f43259F = K02.getBoolean("requested_for_call_type_chat");
        this.f43260G = this.f43262I.getBoolean("is_reopen_chat_form", false);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LiveChatUtil.setStartChatDisabled();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        if (getActivity() == null) {
            return true;
        }
        getActivity().onBackPressed();
        return true;
    }

    @Override // bg.f, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC5479a supportActionBar = ((AbstractActivityC5481c) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.r(new ColorDrawable(P.e(getContext(), AbstractC5886l.f59835h2)));
            supportActionBar.u(true);
            supportActionBar.y(true);
            supportActionBar.t(true);
            supportActionBar.B(null);
            j1();
        }
    }

    public final void p1(final List list) {
        this.f43263J.post(new Runnable() { // from class: com.zoho.livechat.android.modules.conversations.ui.fragments.g
            @Override // java.lang.Runnable
            public final void run() {
                w.n0(w.this, list);
            }
        });
    }

    public final boolean q1() {
        m mVar = this.f43282n;
        k kVar = k.Message;
        RecyclerView.F d10 = mVar.d(kVar);
        if (d10 == null) {
            this.f43296y = L0();
            return false;
        }
        String c10 = this.f43282n.c(kVar, d10);
        if (c10 != null) {
            String trim = c10.trim();
            if (trim.isEmpty()) {
                return true;
            }
            this.f43296y = trim;
        }
        return false;
    }
}
