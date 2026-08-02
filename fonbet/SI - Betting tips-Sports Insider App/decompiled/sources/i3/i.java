package i3;

import android.os.Bundle;
import com.sports.insider.ui.faq.FaqSearchFragment;
import com.sports.insider.ui.faq.articles.AcademyContentFragment;
import com.sports.insider.ui.faq.articles.FaqContentFragment;
import com.sports.insider.ui.news.fragment.ShowNewsFragment;
import com.sports.insider.ui.onboarding.BoardSiAcademyFragment;
import com.sports.insider.ui.onboarding.IdentifyFragment;
import com.sports.insider.ui.onboarding.NoEthernetFragment;
import com.sports.insider.ui.pays.LivePayFragment;
import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.pays.VipAccessFragment;
import com.sports.insider.ui.prediction.ExpressFragment;
import com.sports.insider.ui.prediction.PredictionFragment;
import com.sports.insider.ui.prediction.PremiumFragment;
import com.sports.insider.ui.subs.ListSubsFragment;
import com.sports.insider.ui.support.SupportChat;
import com.sports.insider.ui.support.SupportMailFragment;
import com.sports.insider.ui.viewpage.ViewCloudFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10918b;

    public /* synthetic */ i(int i5, Object obj) {
        this.f10917a = i5;
        this.f10918b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10917a) {
            case 0:
                return new c[((hg.g[]) this.f10918b).length];
            case 1:
                ShowNewsFragment showNewsFragment = (ShowNewsFragment) this.f10918b;
                Bundle arguments = showNewsFragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + showNewsFragment + " has null arguments");
            case 2:
                BoardSiAcademyFragment boardSiAcademyFragment = (BoardSiAcademyFragment) this.f10918b;
                Bundle arguments2 = boardSiAcademyFragment.getArguments();
                if (arguments2 != null) {
                    return arguments2;
                }
                throw new IllegalStateException("Fragment " + boardSiAcademyFragment + " has null arguments");
            case 3:
                IdentifyFragment identifyFragment = (IdentifyFragment) this.f10918b;
                Bundle arguments3 = identifyFragment.getArguments();
                if (arguments3 != null) {
                    return arguments3;
                }
                throw new IllegalStateException("Fragment " + identifyFragment + " has null arguments");
            case 4:
                NoEthernetFragment noEthernetFragment = (NoEthernetFragment) this.f10918b;
                Bundle arguments4 = noEthernetFragment.getArguments();
                if (arguments4 != null) {
                    return arguments4;
                }
                throw new IllegalStateException("Fragment " + noEthernetFragment + " has null arguments");
            case 5:
                LivePayFragment livePayFragment = (LivePayFragment) this.f10918b;
                Bundle arguments5 = livePayFragment.getArguments();
                if (arguments5 != null) {
                    return arguments5;
                }
                throw new IllegalStateException("Fragment " + livePayFragment + " has null arguments");
            case 6:
                PayExpressFragment payExpressFragment = (PayExpressFragment) this.f10918b;
                Bundle arguments6 = payExpressFragment.getArguments();
                if (arguments6 != null) {
                    return arguments6;
                }
                throw new IllegalStateException("Fragment " + payExpressFragment + " has null arguments");
            case 7:
                PayPremiumFragment payPremiumFragment = (PayPremiumFragment) this.f10918b;
                Bundle arguments7 = payPremiumFragment.getArguments();
                if (arguments7 != null) {
                    return arguments7;
                }
                throw new IllegalStateException("Fragment " + payPremiumFragment + " has null arguments");
            case 8:
                VipAccessFragment vipAccessFragment = (VipAccessFragment) this.f10918b;
                Bundle arguments8 = vipAccessFragment.getArguments();
                if (arguments8 != null) {
                    return arguments8;
                }
                throw new IllegalStateException("Fragment " + vipAccessFragment + " has null arguments");
            case 9:
                ExpressFragment expressFragment = (ExpressFragment) this.f10918b;
                Bundle arguments9 = expressFragment.getArguments();
                if (arguments9 != null) {
                    return arguments9;
                }
                throw new IllegalStateException("Fragment " + expressFragment + " has null arguments");
            case 10:
                PredictionFragment predictionFragment = (PredictionFragment) this.f10918b;
                Bundle arguments10 = predictionFragment.getArguments();
                if (arguments10 != null) {
                    return arguments10;
                }
                throw new IllegalStateException("Fragment " + predictionFragment + " has null arguments");
            case 11:
                PremiumFragment premiumFragment = (PremiumFragment) this.f10918b;
                Bundle arguments11 = premiumFragment.getArguments();
                if (arguments11 != null) {
                    return arguments11;
                }
                throw new IllegalStateException("Fragment " + premiumFragment + " has null arguments");
            case 12:
                ListSubsFragment listSubsFragment = (ListSubsFragment) this.f10918b;
                Bundle arguments12 = listSubsFragment.getArguments();
                if (arguments12 != null) {
                    return arguments12;
                }
                throw new IllegalStateException("Fragment " + listSubsFragment + " has null arguments");
            case 13:
                FaqSearchFragment faqSearchFragment = (FaqSearchFragment) this.f10918b;
                Bundle arguments13 = faqSearchFragment.getArguments();
                if (arguments13 != null) {
                    return arguments13;
                }
                throw new IllegalStateException("Fragment " + faqSearchFragment + " has null arguments");
            case 14:
                SupportChat supportChat = (SupportChat) this.f10918b;
                Bundle arguments14 = supportChat.getArguments();
                if (arguments14 != null) {
                    return arguments14;
                }
                throw new IllegalStateException("Fragment " + supportChat + " has null arguments");
            case 15:
                SupportMailFragment supportMailFragment = (SupportMailFragment) this.f10918b;
                Bundle arguments15 = supportMailFragment.getArguments();
                if (arguments15 != null) {
                    return arguments15;
                }
                throw new IllegalStateException("Fragment " + supportMailFragment + " has null arguments");
            case 16:
                ViewCloudFragment viewCloudFragment = (ViewCloudFragment) this.f10918b;
                Bundle arguments16 = viewCloudFragment.getArguments();
                if (arguments16 != null) {
                    return arguments16;
                }
                throw new IllegalStateException("Fragment " + viewCloudFragment + " has null arguments");
            case 17:
                AcademyContentFragment academyContentFragment = (AcademyContentFragment) this.f10918b;
                Bundle arguments17 = academyContentFragment.getArguments();
                if (arguments17 != null) {
                    return arguments17;
                }
                throw new IllegalStateException("Fragment " + academyContentFragment + " has null arguments");
            default:
                FaqContentFragment faqContentFragment = (FaqContentFragment) this.f10918b;
                Bundle arguments18 = faqContentFragment.getArguments();
                if (arguments18 != null) {
                    return arguments18;
                }
                throw new IllegalStateException("Fragment " + faqContentFragment + " has null arguments");
        }
    }
}
