package com.henninghall.date_picker;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import ki.AbstractC5260a;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog f38459a;

    public class a implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f38460a;

        public a(i iVar) {
            this.f38460a = iVar;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            com.henninghall.date_picker.e.c(this.f38460a.getDate(), this.f38460a.getPickerId());
        }
    }

    /* renamed from: com.henninghall.date_picker.b$b, reason: collision with other inner class name */
    public class C0535b implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f38462a;

        public C0535b(i iVar) {
            this.f38462a = iVar;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            com.henninghall.date_picker.e.b(this.f38462a.getPickerId());
        }
    }

    public class c implements DialogInterface.OnCancelListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f38464a;

        public c(Callback callback) {
            this.f38464a = callback;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f38464a.invoke(new Object[0]);
        }
    }

    public class d implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f38466a;

        public d(Callback callback) {
            this.f38466a = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f38466a.invoke(new Object[0]);
            dialogInterface.dismiss();
        }
    }

    public class e implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f38468a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f38469b;

        public e(Callback callback, i iVar) {
            this.f38468a = callback;
            this.f38469b = iVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f38468a.invoke(this.f38469b.getDate());
            dialogInterface.dismiss();
        }
    }

    public class f implements DialogInterface.OnShowListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38471a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AlertDialog f38472b;

        public f(String str, AlertDialog alertDialog) {
            this.f38471a = str;
            this.f38472b = alertDialog;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            String str = this.f38471a;
            if (str != null) {
                int parseColor = Color.parseColor(str);
                this.f38472b.getButton(-1).setTextColor(parseColor);
                this.f38472b.getButton(-2).setTextColor(parseColor);
            }
        }
    }

    public class g implements Tb.d {
        public g() {
        }

        @Override // Tb.d
        public void a(Tb.c cVar) {
            b.this.g(cVar == Tb.c.idle);
        }
    }

    public static class h extends AlertDialog.Builder {
        public h(Context context, int i10) {
            super(context, i10);
        }

        public h a(ReadableMap readableMap) {
            String string = readableMap.getString("textColor");
            CharSequence string2 = readableMap.getString("title");
            if (string == null) {
                setTitle(string2);
                return this;
            }
            TextView textView = new TextView(com.henninghall.date_picker.c.f38475a.getCurrentActivity());
            textView.setText(string2);
            TypedValue typedValue = new TypedValue();
            com.henninghall.date_picker.c.f38475a.getCurrentActivity().getTheme().resolveAttribute(R.attr.dialogPreferredPadding, typedValue, true);
            int complexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, com.henninghall.date_picker.c.f38475a.getResources().getDisplayMetrics());
            textView.setPadding(complexToDimensionPixelSize, complexToDimensionPixelSize, complexToDimensionPixelSize, 0);
            textView.setTextSize(20.0f);
            textView.setTextColor(Color.parseColor(string));
            setCustomTitle(textView);
            return this;
        }
    }

    public b(Context context) {
        AbstractC5260a.b(context, false);
    }

    public void b() {
        this.f38459a.dismiss();
    }

    public final AlertDialog c(ReadableMap readableMap, i iVar, Callback callback, Callback callback2) {
        String string = readableMap.getString("confirmText");
        String string2 = readableMap.getString("cancelText");
        String string3 = readableMap.getString("buttonColor");
        AlertDialog create = new h(com.henninghall.date_picker.c.f38475a.getCurrentActivity(), e(readableMap)).a(readableMap).setCancelable(true).setView(h(iVar)).setPositiveButton(string, new e(callback, iVar)).setNegativeButton(string2, new d(callback2)).setOnCancelListener(new c(callback2)).create();
        create.setOnShowListener(new f(string3, create));
        return create;
    }

    public final i d(ReadableMap readableMap) {
        i iVar = new i(new LinearLayout.LayoutParams(-1, o.j(180)));
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (!nextKey.equals("style")) {
                try {
                    iVar.d(nextKey, dynamic);
                } catch (Exception unused) {
                }
            }
        }
        iVar.c();
        iVar.a(new g());
        return iVar;
    }

    public final int e(ReadableMap readableMap) {
        String string = readableMap.getString("theme");
        if (string == null) {
            return 0;
        }
        if (string.equals("dark")) {
            return 4;
        }
        return !string.equals("light") ? 0 : 5;
    }

    public void f(ReadableMap readableMap) {
        i d10 = d(readableMap);
        AlertDialog c10 = c(readableMap, d10, new a(d10), new C0535b(d10));
        this.f38459a = c10;
        c10.show();
    }

    public final void g(boolean z10) {
        this.f38459a.getButton(-1).setEnabled(z10);
    }

    public final View h(i iVar) {
        LinearLayout linearLayout = new LinearLayout(com.henninghall.date_picker.c.f38475a);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(iVar);
        linearLayout.setPadding(0, o.j(20), 0, 0);
        return linearLayout;
    }
}
