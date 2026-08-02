package com.sofascore.results.chat.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.icu.text.BreakIterator;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.chat.view.ChatMessageInputView;
import defpackage.a5f;
import defpackage.aik;
import defpackage.ao2;
import defpackage.as9;
import defpackage.c6;
import defpackage.dmi;
import defpackage.dr2;
import defpackage.fn0;
import defpackage.g1;
import defpackage.gr2;
import defpackage.j58;
import defpackage.js2;
import defpackage.kr2;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.ns2;
import defpackage.nv;
import defpackage.o8;
import defpackage.rq3;
import defpackage.ts2;
import defpackage.uic;
import defpackage.un0;
import defpackage.us2;
import defpackage.xw3;
import defpackage.yea;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.zic;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/sofascore/results/chat/view/ChatMessageInputView;", "Lo8;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnClickListener;", "", "getLayoutId", "()I", "", "alpha2", "", "setChatFlag", "(Ljava/lang/String;)V", "Lcom/sofascore/model/chat/ChatUser;", "user", "setUser", "(Lcom/sofascore/model/chat/ChatUser;)V", "Lkotlin/Function1;", "o", "Lkotlin/jvm/functions/Function1;", "getOnClickCallback", "()Lkotlin/jvm/functions/Function1;", "setOnClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "onClickCallback", "Landroid/graphics/drawable/Drawable;", CampaignEx.JSON_KEY_AD_Q, "Ljoa;", "getTranslateDrawable", "()Landroid/graphics/drawable/Drawable;", "translateDrawable", "", "getShowChatRules", "()Z", "showChatRules", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChatMessageInputView extends o8 implements TextWatcher, View.OnClickListener {
    public static final /* synthetic */ int x = 0;
    public final js2 d;
    public int e;
    public boolean f;
    public g1 g;
    public final ArrayList h;
    public boolean i;
    public ChatUser j;
    public us2 k;
    public dr2 l;
    public g1 m;
    public String n;

    /* renamed from: o, reason: from kotlin metadata */
    public Function1 onClickCallback;
    public Integer p;
    public final mqi q;
    public final BreakIterator r;
    public final int s;
    public final ArrayList t;
    public final int u;
    public final int v;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.button_add_flag;
        ImageView imageView = (ImageView) nq8.B(R.id.button_add_flag, root);
        if (imageView != null) {
            i = R.id.button_container;
            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.button_container, root);
            if (frameLayout != null) {
                i = R.id.button_overlay;
                View B = nq8.B(R.id.button_overlay, root);
                if (B != null) {
                    i = R.id.button_send_message;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.button_send_message, root);
                    if (imageView2 != null) {
                        i = R.id.change_layout_button;
                        ImageView imageView3 = (ImageView) nq8.B(R.id.change_layout_button, root);
                        if (imageView3 != null) {
                            i = R.id.enter_message;
                            EditText editText = (EditText) nq8.B(R.id.enter_message, root);
                            if (editText != null) {
                                i = R.id.expand_button;
                                ImageView imageView4 = (ImageView) nq8.B(R.id.expand_button, root);
                                if (imageView4 != null) {
                                    i = R.id.image_preview;
                                    ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.image_preview, root);
                                    if (shapeableImageView != null) {
                                        i = R.id.image_preview_container;
                                        FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.image_preview_container, root);
                                        if (frameLayout2 != null) {
                                            i = R.id.login_message;
                                            TextView textView = (TextView) nq8.B(R.id.login_message, root);
                                            if (textView != null) {
                                                i = R.id.send_progress;
                                                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) nq8.B(R.id.send_progress, root);
                                                if (circularProgressIndicator != null) {
                                                    i = R.id.translate_button;
                                                    ImageView imageView5 = (ImageView) nq8.B(R.id.translate_button, root);
                                                    if (imageView5 != null) {
                                                        i = R.id.upload_button;
                                                        ImageView imageView6 = (ImageView) nq8.B(R.id.upload_button, root);
                                                        if (imageView6 != null) {
                                                            this.d = new js2((FrameLayout) root, imageView, frameLayout, B, imageView2, imageView3, editText, imageView4, shapeableImageView, frameLayout2, textView, circularProgressIndicator, imageView5, imageView6);
                                                            SharedPreferences sharedPreferences = uic.j;
                                                            if (sharedPreferences == null) {
                                                                Context applicationContext = context.getApplicationContext();
                                                                synchronized (uic.i) {
                                                                    sharedPreferences = a5f.d(applicationContext);
                                                                    uic.j = sharedPreferences;
                                                                }
                                                                sharedPreferences.getClass();
                                                            }
                                                            this.f = sharedPreferences.getBoolean("SHOW_REDESIGNED_CHAT_LAYOUT", false);
                                                            this.h = new ArrayList();
                                                            this.q = ypa.b(new c6(context, 11));
                                                            this.r = BreakIterator.getCharacterInstance(Locale.getDefault());
                                                            int s = ao2.s(24, context);
                                                            this.s = s;
                                                            this.t = new ArrayList();
                                                            this.u = ao2.s(16, context);
                                                            this.v = s;
                                                            return;
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final boolean getShowChatRules() {
        SharedPreferences d;
        Context context = getContext();
        context.getClass();
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        return sharedPreferences.getBoolean("SHOW_CHAT_RULES", true);
    }

    private final Drawable getTranslateDrawable() {
        return (Drawable) this.q.getValue();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        ImageView imageView = (ImageView) this.d.c;
        String obj = StringsKt.l0(editable).toString();
        BreakIterator breakIterator = this.r;
        breakIterator.getClass();
        obj.getClass();
        breakIterator.setText(obj);
        int i = 0;
        while (breakIterator.next() != -1) {
            i++;
        }
        imageView.setEnabled(i > 1);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.chat_text_view;
    }

    @Nullable
    public final Function1<Integer, Unit> getOnClickCallback() {
        return this.onClickCallback;
    }

    public final void j(ImageView imageView) {
        int visibility = imageView.getVisibility();
        ArrayList arrayList = this.t;
        if (visibility == 0 && !arrayList.contains(imageView)) {
            arrayList.add(imageView);
        } else if (imageView.getVisibility() != 0 && arrayList.contains(imageView)) {
            arrayList.remove(imageView);
        }
    }

    public final void l() {
        js2 js2Var = this.d;
        ((ImageView) js2Var.h).setOnClickListener(this);
        ((FrameLayout) js2Var.k).setVisibility(8);
        this.i = false;
        ImageView imageView = (ImageView) js2Var.h;
        dr2 dr2Var = this.l;
        if (dr2Var == null) {
            Intrinsics.i("chatConfig");
            throw null;
        }
        imageView.setVisibility(dr2Var.d ? 0 : 8);
        j(imageView);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087 A[LOOP:0: B:19:0x0080->B:21:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        int i;
        BreakIterator breakIterator;
        js2 js2Var = this.d;
        ImageView imageView = (ImageView) js2Var.b;
        EditText editText = (EditText) js2Var.m;
        ImageView imageView2 = (ImageView) js2Var.h;
        View view = (View) js2Var.l;
        imageView.setEnabled(true);
        ChatUser chatUser = this.j;
        if (chatUser == null) {
            Intrinsics.i("chatUser");
            throw null;
        }
        boolean isLoggedIn = chatUser.isLoggedIn();
        TextView textView = js2Var.d;
        if (!isLoggedIn) {
            textView.setVisibility(0);
            view.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        if (!this.i) {
            dr2 dr2Var = this.l;
            if (dr2Var == null) {
                Intrinsics.i("chatConfig");
                throw null;
            }
            if (dr2Var.d) {
                i = 0;
                imageView2.setVisibility(i);
                imageView2.setEnabled(true);
                j(imageView2);
                editText.setEnabled(true);
                editText.setVisibility(0);
                editText.clearFocus();
                view.setVisibility(getShowChatRules() ? 0 : 8);
                ImageView imageView3 = (ImageView) js2Var.c;
                Editable editableText = editText.getEditableText();
                editableText.getClass();
                String obj = StringsKt.l0(editableText).toString();
                breakIterator = this.r;
                breakIterator.getClass();
                obj.getClass();
                breakIterator.setText(obj);
                int i2 = 0;
                while (breakIterator.next() != -1) {
                    i2++;
                }
                imageView3.setEnabled(i2 > 1);
            }
        }
        i = 8;
        imageView2.setVisibility(i);
        imageView2.setEnabled(true);
        j(imageView2);
        editText.setEnabled(true);
        editText.setVisibility(0);
        editText.clearFocus();
        view.setVisibility(getShowChatRules() ? 0 : 8);
        ImageView imageView32 = (ImageView) js2Var.c;
        Editable editableText2 = editText.getEditableText();
        editableText2.getClass();
        String obj2 = StringsKt.l0(editableText2).toString();
        breakIterator = this.r;
        breakIterator.getClass();
        obj2.getClass();
        breakIterator.setText(obj2);
        int i22 = 0;
        while (breakIterator.next() != -1) {
        }
        imageView32.setEnabled(i22 > 1);
    }

    public final void o() {
        if (!this.w || ((ImageView) this.d.f).getVisibility() == 0) {
            return;
        }
        ImageView imageView = (ImageView) CollectionsKt.firstOrNull(this.t);
        int i = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(imageView != null ? imageView.getMeasuredWidth() : 0, 0);
        ofInt.addUpdateListener(new gr2(ofInt, this, i));
        ofInt.addListener(new kr2(this, 0));
        ofInt.setDuration(250L);
        ofInt.start();
        ArrayList arrayList = this.h;
        arrayList.add(ofInt);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, this.s);
        ofInt2.addUpdateListener(new gr2(ofInt2, this, 1));
        ofInt2.addListener(new kr2(this, 1));
        ofInt2.setDuration(350L);
        ofInt2.start();
        arrayList.add(ofInt2);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ir2] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        view.getClass();
        int id = view.getId();
        final int i = 0;
        js2 js2Var = this.d;
        if (id != R.id.button_send_message) {
            if (id == R.id.upload_button) {
                ((EditText) js2Var.m).clearFocus();
                Function1 function1 = this.onClickCallback;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(view.getId()));
                    return;
                }
                return;
            }
            final int i2 = 1;
            if (id == R.id.button_overlay) {
                ChatUser chatUser = this.j;
                if (chatUser == null) {
                    Intrinsics.i("chatUser");
                    throw null;
                }
                if (!chatUser.isLoggedIn()) {
                    Function1 function12 = this.onClickCallback;
                    if (function12 != null) {
                        function12.invoke(Integer.valueOf(view.getId()));
                        return;
                    }
                    return;
                }
                if (getShowChatRules()) {
                    Context context = getContext();
                    context.getClass();
                    zic.N(context, new Function0(this) { // from class: ir2
                        public final /* synthetic */ ChatMessageInputView b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            SharedPreferences d;
                            int i3 = i;
                            ChatMessageInputView chatMessageInputView = this.b;
                            switch (i3) {
                                case 0:
                                    ((View) chatMessageInputView.d.l).setVisibility(8);
                                    ((EditText) chatMessageInputView.d.m).requestFocus();
                                    EditText editText = (EditText) chatMessageInputView.d.m;
                                    Context context2 = editText.getContext();
                                    context2.getClass();
                                    InputMethodManager inputMethodManager = (InputMethodManager) context2.getSystemService(InputMethodManager.class);
                                    if (inputMethodManager != null) {
                                        inputMethodManager.showSoftInput(editText, 0);
                                    }
                                    Context context3 = chatMessageInputView.getContext();
                                    context3.getClass();
                                    SharedPreferences sharedPreferences = uic.j;
                                    if (sharedPreferences == null) {
                                        Context applicationContext = context3.getApplicationContext();
                                        synchronized (uic.i) {
                                            d = a5f.d(applicationContext);
                                            uic.j = d;
                                        }
                                        d.getClass();
                                        sharedPreferences = d;
                                    }
                                    SharedPreferences.Editor i4 = dmi.i(sharedPreferences, "SHOW_CHAT_RULES", false);
                                    Unit unit = Unit.a;
                                    i4.apply();
                                    return Unit.a;
                                default:
                                    int i5 = ChatMessageInputView.x;
                                    Context context4 = chatMessageInputView.getContext();
                                    context4.getClass();
                                    InputMethodManager inputMethodManager2 = (InputMethodManager) context4.getSystemService(InputMethodManager.class);
                                    if (inputMethodManager2 != null) {
                                        inputMethodManager2.hideSoftInputFromWindow(chatMessageInputView.getWindowToken(), 0);
                                    }
                                    return Unit.a;
                            }
                        }
                    }, new Function0(this) { // from class: ir2
                        public final /* synthetic */ ChatMessageInputView b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            SharedPreferences d;
                            int i3 = i2;
                            ChatMessageInputView chatMessageInputView = this.b;
                            switch (i3) {
                                case 0:
                                    ((View) chatMessageInputView.d.l).setVisibility(8);
                                    ((EditText) chatMessageInputView.d.m).requestFocus();
                                    EditText editText = (EditText) chatMessageInputView.d.m;
                                    Context context2 = editText.getContext();
                                    context2.getClass();
                                    InputMethodManager inputMethodManager = (InputMethodManager) context2.getSystemService(InputMethodManager.class);
                                    if (inputMethodManager != null) {
                                        inputMethodManager.showSoftInput(editText, 0);
                                    }
                                    Context context3 = chatMessageInputView.getContext();
                                    context3.getClass();
                                    SharedPreferences sharedPreferences = uic.j;
                                    if (sharedPreferences == null) {
                                        Context applicationContext = context3.getApplicationContext();
                                        synchronized (uic.i) {
                                            d = a5f.d(applicationContext);
                                            uic.j = d;
                                        }
                                        d.getClass();
                                        sharedPreferences = d;
                                    }
                                    SharedPreferences.Editor i4 = dmi.i(sharedPreferences, "SHOW_CHAT_RULES", false);
                                    Unit unit = Unit.a;
                                    i4.apply();
                                    return Unit.a;
                                default:
                                    int i5 = ChatMessageInputView.x;
                                    Context context4 = chatMessageInputView.getContext();
                                    context4.getClass();
                                    InputMethodManager inputMethodManager2 = (InputMethodManager) context4.getSystemService(InputMethodManager.class);
                                    if (inputMethodManager2 != null) {
                                        inputMethodManager2.hideSoftInputFromWindow(chatMessageInputView.getWindowToken(), 0);
                                    }
                                    return Unit.a;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (id != R.id.image_preview_container) {
                Function1 function13 = this.onClickCallback;
                if (function13 != null) {
                    function13.invoke(Integer.valueOf(view.getId()));
                    return;
                }
                return;
            }
            us2 us2Var = this.k;
            if (us2Var == null) {
                Intrinsics.i("viewModel");
                throw null;
            }
            us2Var.l.j(null);
            ImageView imageView = (ImageView) js2Var.c;
            ((EditText) js2Var.m).getText().getClass();
            imageView.setEnabled(!StringsKt.R(r2));
            p();
            return;
        }
        String obj = StringsKt.l0(((EditText) js2Var.m).getText().toString()).toString();
        dr2 dr2Var = this.l;
        if (dr2Var == null) {
            Intrinsics.i("chatConfig");
            throw null;
        }
        if (!dr2Var.e) {
            obj = c.r(obj, "\n", " ", false);
        }
        String str2 = obj;
        if (str2.length() <= 0 && !this.i) {
            return;
        }
        ChatUser chatUser2 = this.j;
        if (chatUser2 == null) {
            Intrinsics.i("chatUser");
            throw null;
        }
        new Message(str2, chatUser2, 0L, 0, 0, false, 32, null).setLocal();
        if (this.p != null) {
            us2 us2Var2 = this.k;
            if (us2Var2 == null) {
                Intrinsics.i("viewModel");
                throw null;
            }
            ChatInterface chatInterface = us2Var2.y;
            if (chatInterface != null) {
                Context context2 = getContext();
                context2.getClass();
                ChatUser chatUser3 = this.j;
                if (chatUser3 == null) {
                    Intrinsics.i("chatUser");
                    throw null;
                }
                if (chatUser3.isAdmin()) {
                    str = "admin";
                } else {
                    ChatUser chatUser4 = this.j;
                    if (chatUser4 == null) {
                        Intrinsics.i("chatUser");
                        throw null;
                    }
                    str = chatUser4.isModerator() ? "moderator" : "user";
                }
                nv.t(context2, "reply", str, chatInterface);
            }
        }
        us2 us2Var3 = this.k;
        if (us2Var3 == null) {
            Intrinsics.i("viewModel");
            throw null;
        }
        String str3 = this.n;
        Integer num = this.p;
        yea yeaVar = j58.a;
        if (!fn0.B("chat_translate_sendTranslations") || us2Var3.E.matcher(str2).matches()) {
            us2Var3.l(str2, null, str3, num);
        } else {
            xw3.L(un0.z(us2Var3), null, null, new ts2(us2Var3, str2, str3, num, (rq3) null, 0), 3);
        }
        l();
        ((EditText) js2Var.m).setText("");
        g1 g1Var = this.m;
        if (g1Var != null) {
            g1Var.invoke();
        }
        this.p = null;
        g1 g1Var2 = this.g;
        if (g1Var2 != null) {
            g1Var2.invoke();
        }
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        js2 js2Var = this.d;
        EditText editText = (EditText) js2Var.m;
        EditText editText2 = (EditText) js2Var.m;
        if (editText.length() > this.e) {
            editText2.setText(editText2.getText().subSequence(0, this.e));
            Selection.setSelection(editText2.getText(), this.e);
        }
        if (Intrinsics.c(charSequence.toString(), "")) {
            return;
        }
        o();
    }

    public final void p() {
        js2 js2Var = this.d;
        aik.Q((ShapeableImageView) js2Var.n).a();
        ((CircularProgressIndicator) js2Var.o).setVisibility(8);
        ImageView imageView = (ImageView) js2Var.c;
        imageView.setVisibility(0);
        imageView.setOnClickListener(this);
        l();
    }

    public final void q() {
        if (this.w && ((ImageView) this.d.f).getVisibility() == 0) {
            int i = this.s;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
            ofInt.addUpdateListener(new gr2(ofInt, this, 2));
            ofInt.addListener(new kr2(this, 2));
            ofInt.setDuration(250L);
            ofInt.start();
            ValueAnimator ofInt2 = ValueAnimator.ofInt(i, 0);
            ofInt2.addUpdateListener(new gr2(ofInt2, this, 3));
            ofInt2.addListener(new kr2(this, 3));
            ofInt2.setDuration(350L);
            ofInt2.start();
        }
    }

    public final void r(String str) {
        String upperCase;
        js2 js2Var = this.d;
        if (str == null) {
            ((ImageView) js2Var.g).setImageDrawable(getTranslateDrawable());
            return;
        }
        ImageView imageView = (ImageView) js2Var.g;
        Map map = ns2.a;
        if (str.equals("en")) {
            upperCase = "GB";
        } else {
            Locale locale = Locale.US;
            locale.getClass();
            upperCase = str.toUpperCase(locale);
            upperCase.getClass();
        }
        as9.c(imageView, upperCase, false, null, 6);
    }

    public final void setChatFlag(@Nullable String alpha2) {
        js2 js2Var = this.d;
        if (alpha2 == null || alpha2.length() == 0) {
            ((ImageView) js2Var.b).setImageResource(R.drawable.ic_add_flag);
            ((ImageView) js2Var.b).setImageTintList(getContext().getColorStateList(R.color.chat_button_selector_color));
            this.n = null;
        } else {
            as9.c((ImageView) js2Var.b, alpha2, false, null, 6);
            ((ImageView) js2Var.b).setImageTintList(null);
            this.n = alpha2;
        }
    }

    public final void setOnClickCallback(@Nullable Function1<? super Integer, Unit> function1) {
        this.onClickCallback = function1;
    }

    public final void setUser(@NotNull ChatUser user) {
        SharedPreferences d;
        user.getClass();
        this.j = user;
        if (user.isBanned()) {
            Context context = getContext();
            context.getClass();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            SharedPreferences.Editor i = dmi.i(sharedPreferences, "SHOW_CHAT_RULES", true);
            Unit unit = Unit.a;
            i.apply();
        }
        ChatUser chatUser = this.j;
        if (chatUser == null) {
            Intrinsics.i("chatUser");
            throw null;
        }
        if (!chatUser.isLoggedIn()) {
            js2 js2Var = this.d;
            js2Var.d.setVisibility(0);
            ((ImageView) js2Var.h).setVisibility(8);
            ((EditText) js2Var.m).setVisibility(8);
            j((ImageView) js2Var.h);
        }
        setVisibility(0);
    }
}
