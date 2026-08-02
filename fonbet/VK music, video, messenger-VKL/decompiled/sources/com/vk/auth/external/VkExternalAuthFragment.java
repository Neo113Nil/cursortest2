package com.vk.auth.external;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.external.a;
import com.vk.core.apps.BuildInfo;
import com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.btu0;
import xsna.epx;
import xsna.f4m;
import xsna.ho8;
import xsna.izs;
import xsna.jjc;
import xsna.s3q0;
import xsna.skj0;
import xsna.ssu0;
import xsna.uhv0;
import xsna.urd0;
import xsna.wsu0;
import xsna.ysu0;

/* compiled from: VkExternalAuthFragment.kt */
/* loaded from: classes15.dex */
public final class VkExternalAuthFragment extends uhv0 {
    public WebView h;
    public View i;
    public TextView j;
    public ProgressBar k;
    public b l;
    public final ysu0 m = new ysu0(this, new a(1, this, VkExternalAuthFragment.class, "onAuth", "onAuth(Z)V", 0));
    public final VkWebFileChooserImpl n = new VkWebFileChooserImpl(this, BuildInfo.f);
    public LaunchParams o;

    /* compiled from: VkExternalAuthFragment.kt */
    public static final class LaunchParams implements Parcelable {
        public static final Parcelable.Creator<LaunchParams> CREATOR = new a();
        public final int b;
        public final String c;
        public final String d;
        public final Uri e;
        public final String f;
        public final String g;

        /* compiled from: VkExternalAuthFragment.kt */
        public static final class a implements Parcelable.Creator<LaunchParams> {
            @Override // android.os.Parcelable.Creator
            public final LaunchParams createFromParcel(Parcel parcel) {
                return new LaunchParams(parcel.readInt(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(LaunchParams.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchParams[] newArray(int i) {
                return new LaunchParams[i];
            }
        }

        public LaunchParams(int i, String str, String str2, Uri uri, String str3, String str4) {
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = uri;
            this.f = str3;
            this.g = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LaunchParams)) {
                return false;
            }
            LaunchParams launchParams = (LaunchParams) obj;
            return this.b == launchParams.b && epx.f(this.c, launchParams.c) && epx.f(this.d, launchParams.d) && epx.f(this.e, launchParams.e) && epx.f(this.f, launchParams.f) && epx.f(this.g, launchParams.g);
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31;
            String str = this.f;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.g;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LaunchParams(appId=");
            sb.append(this.b);
            sb.append(", uuid=");
            sb.append(this.c);
            sb.append(", redirectUrl=");
            sb.append(this.d);
            sb.append(", redirectUri=");
            sb.append(this.e);
            sb.append(", code=");
            sb.append(this.f);
            sb.append(", state=");
            return ho8.a(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
        }
    }

    /* compiled from: VkExternalAuthFragment.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            b bVar = ((VkExternalAuthFragment) this.receiver).l;
            if (bVar != null) {
                if (booleanValue) {
                    bVar.c();
                } else {
                    bVar.d.b(new Result.Failure(new IllegalStateException("Not logged in")));
                }
            }
            return s3q0.a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = i2 == -1;
        VkWebFileChooserImpl vkWebFileChooserImpl = this.n;
        if (vkWebFileChooserImpl.d(i)) {
            vkWebFileChooserImpl.c(i, intent, z);
            return;
        }
        if (i != 101) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        vkWebFileChooserImpl.getClass();
        if (z) {
            Uri data = (intent != null ? intent.getData() : null) == null ? vkWebFileChooserImpl.d : intent.getData();
            if (data != null) {
                s3q0 s3q0Var = s3q0.a;
            }
            ValueCallback<Uri[]> valueCallback = vkWebFileChooserImpl.c;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(data != null ? new Uri[]{data} : null);
            }
        } else {
            ValueCallback<Uri[]> valueCallback2 = vkWebFileChooserImpl.c;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
        }
        vkWebFileChooserImpl.c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.o = arguments != null ? (LaunchParams) arguments.getParcelable("launch_params") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vk_fragment_external_auth, viewGroup, false);
        this.h = (WebView) inflate.findViewById(R.id.fragment_external_auth_webview);
        this.i = inflate.findViewById(R.id.fragment_external_auth_error_container);
        this.k = (ProgressBar) inflate.findViewById(R.id.fragment_external_auth_progress);
        this.j = (TextView) inflate.findViewById(R.id.fragment_external_auth_error_text);
        jjc.g((TextView) inflate.findViewById(R.id.fragment_external_auth_error_retry), new skj0(this, 18));
        WebView webView = this.h;
        if (webView == null) {
            webView = null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        LaunchParams launchParams = this.o;
        if (launchParams != null) {
            int i = launchParams.b;
            String str = launchParams.c;
            String str2 = launchParams.d;
            Uri uri = launchParams.e;
            wsu0 wsu0Var = new wsu0(i, str, str2, launchParams.g, launchParams.f);
            Context requireContext = requireContext();
            ysu0 ysu0Var = this.m;
            this.l = new b(requireContext, this, wsu0Var, ysu0Var);
            WebView webView2 = this.h;
            if (webView2 == null) {
                webView2 = null;
            }
            b bVar = this.l;
            if (bVar == null) {
                bVar = null;
            }
            webView2.setWebChromeClient(new ssu0(bVar, this.n));
            WebView webView3 = this.h;
            if (webView3 == null) {
                webView3 = null;
            }
            b bVar2 = this.l;
            if (bVar2 == null) {
                bVar2 = null;
            }
            webView3.setWebViewClient(new btu0(bVar2, ysu0Var, uri));
        } else {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finishAndRemoveTask();
            }
        }
        b bVar3 = this.l;
        b bVar4 = bVar3 != null ? bVar3 : null;
        bVar4.b.tn(bVar4.f);
        bVar4.c();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        b bVar = this.l;
        if (bVar == null) {
            bVar = null;
        }
        bVar.g.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [android.widget.ProgressBar] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.widget.ProgressBar] */
    public final void tn(com.vk.auth.external.a aVar) {
        if (aVar instanceof a.C0400a) {
            WebView webView = this.h;
            if (webView == null) {
                webView = null;
            }
            f4m.j(webView);
            View view = this.i;
            if (view == null) {
                view = null;
            }
            view.setVisibility(0);
            ProgressBar progressBar = this.k;
            if (progressBar == null) {
                progressBar = null;
            }
            f4m.j(progressBar);
            TextView textView = this.j;
            (textView != null ? textView : null).setText(((a.C0400a) aVar).a);
            return;
        }
        if (aVar.equals(a.b.a)) {
            WebView webView2 = this.h;
            if (webView2 == null) {
                webView2 = null;
            }
            f4m.j(webView2);
            View view2 = this.i;
            if (view2 == null) {
                view2 = null;
            }
            f4m.j(view2);
            ?? r4 = this.k;
            (r4 != 0 ? r4 : null).setVisibility(0);
            return;
        }
        if (!aVar.equals(a.c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        WebView webView3 = this.h;
        if (webView3 == null) {
            webView3 = null;
        }
        webView3.setVisibility(0);
        View view3 = this.i;
        if (view3 == null) {
            view3 = null;
        }
        f4m.j(view3);
        ?? r42 = this.k;
        f4m.j(r42 != 0 ? r42 : null);
    }
}
