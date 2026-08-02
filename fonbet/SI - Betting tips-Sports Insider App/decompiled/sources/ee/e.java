package ee;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f9127a = {"Value Betting - это долгосрочная стратегия ставок на недооцененные букмекером события. Что значит недооцененное событие? Это такое событие, коэффициент которого при вашем личном субъективном мнении совместно с математикой выше ожидаемого. Суть сводится к тому, чтобы определить, выше ли коэффициент букмекера на событие вашего собственного (или, как вам кажется, реального, каким кэф в действительности должен быть).", "Принцип стратегии", "Чтобы определить, недооцененное событие или нет, необходимо воспользоваться следующим неравенством:", "K*P > 1,", "где К - это коэффициент букмекера, а Р - это ваша вероятность наступления события. Давайте разберем на примере. ", "Представим, что в матче Челси - Уотфорд коэффициент на победу Челси равняется 1.7. Это означает, что вероятность победы Челси, по мнению букмекера, равна 70%. А вы считаете, что вероятность победы равна 80% (0.8). Проверяем: 1.7*0.8 = 1.36 > 1, значит, это событие действительно недооценено букмекером. Однако здесь встает главный вопрос: а вы уверены, что вероятность наступления такого события действительно 80%? Быть может, она гораздо ниже, а вы просто любите футбольный клуб Челси?", "Именно поэтому важными составляющими данной стратегии (помимо математики) являются знания и интуиция. Другой момент связан с известностью команд: чем известнее клубы, тем больше информации у букмекера, следовательно, более адекватно коэффициент отражает действительную вероятность наступления события.", "Плюсы и минусы стратегии", "Каждая стратегия обладает своими преимуществами и недостатками. К плюсам value-стратегии можно отнести:", "Довольно низкий уровень риска", "Приносит доход в долгосрочной перспективе", "Не вызывает подозрений у букмекеров", "К минусам стратегии можно отнести:", "Тяжело найти подходящее событие", "Высокая роль правильного самостоятельного анализа", "Прибыль будет только спустя определенное время", "Конечно, данная стратегия рассчитана на более опытных игроков, поскольку здесь помимо математики возрастает роль опыта, знаний и уверенности в исходе. Кроме того, здесь необходимо четко следовать выбранной финансовой стратегии, поскольку проигрыши обязательно будут."};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f9128b = {"Le Value Betting est une stratégie de paris à long terme consistant à trouver des cotes surévaluées. Que signifie cela ? Certains événements ont une probabilité de victoire plus élevée que celle estimée par le bookmaker. Ton objectif principal est donc d’identifier ces événements grâce à ton expérience et à tes connaissances sportives. Comment savoir si un événement est surévalué ? Utilise la formule mathématique suivante :", "", "", "K*P > 1,", "où K est la cote du bookmaker et P ta probabilité estimée de gagner. Exemple : Chelsea contre Watford, la cote pour « Victoire Chelsea » est de 1,7. Le bookmaker estime que Chelsea a 70 % de chances de gagner, mais tu penses que la probabilité réelle est de 80 %. Vérifions : 1,7 × 0,8 = 1,36 > 1 — il s’agit donc d’un Value Bet. ", "", "", "", "Mais la vraie question est : es-tu vraiment sûr de ces 80 % ? Peut-être que la probabilité est inférieure et que tu es simplement un grand fan de Chelsea FC. C’est pourquoi la connaissance et l’intuition sont des atouts essentiels du Value Betting.", "Faible niveau de risque", "Potentiel de profit élevé", "Pas de problèmes avec les bookmakers", "Inconvénients:", "Difficile de trouver les bons événements", "Forte exigence d’analyse personnelle et de discipline", "Rentabilité uniquement sur le long terme", ""};

    /* renamed from: c, reason: collision with root package name */
    public final String[] f9129c = {"Value Betting ist eine langfristige Wettstrategie, bei der du überbewertete Quoten finden musst. Was bedeutet das? Einige Ereignisse haben eine höhere Gewinnwahrscheinlichkeit, als der Buchmacher denkt, und deine Hauptaufgabe besteht darin, diese Ereignisse mithilfe deiner Erfahrung und deines Sportwissens zu finden. Wie weiß man, ob ein Ereignis überbewertet ist oder nicht? Verwende die folgende mathematische Formel:", "", "", "K*P > 1,", "wobei K die Quote des Buchmachers und P deine geschätzte Gewinnwahrscheinlichkeit ist. Beispiel: Chelsea gegen Watford – die Quote für „Sieg Chelsea“ beträgt 1,7. Der Buchmacher glaubt also, dass Chelsea eine 70 % Gewinnchance hat. Du denkst aber, die tatsächliche Chance liegt bei 80 %. Prüfen wir: 1,7 × 0,8 = 1,36 > 1 – das ist ein Value Bet. ", "", "", "", "Aber hier kommt die Hauptfrage: Bist du dir bei diesen 80 % wirklich sicher? Vielleicht ist die Chance geringer, und du bist einfach nur Chelsea-Fan? Genau deshalb sind Wissen und Intuition zwei wichtige Helfer beim Value Betting.", "Geringes Risiko", "Potenziell hoher Gewinn", "Keine Probleme mit Buchmachern", "Nachteile:", "Schwierige Suche nach passenden Ereignissen", "Hohe Anforderungen an Disziplin und Wissen", "Gewinn erst langfristig sichtbar", ""};

    /* renamed from: d, reason: collision with root package name */
    public final String[] f9130d = {"Value Betting es una estrategia de apuestas a largo plazo en la que debes encontrar cuotas sobrevaloradas. ¿Qué significa eso? Algunos eventos tienen una mayor probabilidad de ganar de lo que el corredor de apuestas piensa, y tu tarea principal es identificar esos eventos usando tu experiencia y conocimientos deportivos. ¿Cómo saber si un evento está sobrevalorado o no? Usa la siguiente fórmula matemática:", "", "", "K*P > 1,", "donde K es la cuota del corredor de apuestas y P tu probabilidad estimada de ganar. Ejemplo: Chelsea contra Watford, la apuesta “Gana Chelsea” tiene una cuota de 1.7. El corredor de apuestas cree que Chelsea tiene un 70 % de posibilidades de ganar, pero tú crees que en realidad es del 80 %. Verifiquemos: 1.7 × 0.8 = 1.36 > 1 — por lo tanto, es una Value Bet. ", "", "", "", "Pero aquí viene la pregunta principal: ¿estás realmente seguro de ese 80 %? Quizás la probabilidad sea menor y simplemente seas un gran fan del Chelsea FC. Por eso, el conocimiento y la intuición son factores clave en el Value Betting.", "Bajo nivel de riesgo", "Alta rentabilidad potencial", "No genera problemas con las casas de apuestas", "Desventajas:", "Difícil encontrar los eventos adecuados", "Alta exigencia de disciplina y conocimiento", "Beneficios solo a largo plazo", ""};

    /* renamed from: e, reason: collision with root package name */
    public final String[] f9131e = {"Value Betting é uma estratégia de apostas de longo prazo, em que deves encontrar odds sobrevalorizadas. O que isso significa? Alguns eventos têm mais chances de vitória do que o que o bookmaker acredita, e o teu principal objetivo é identificar esses eventos com base na tua experiência e conhecimento desportivo. Como saber se um evento está sobrevalorizado? Usa a seguinte fórmula matemática:", "", "", "K*P > 1,", "onde K é a odd do bookmaker e P a tua probabilidade estimada de vitória. Exemplo: Chelsea contra Watford – a odd para “Vitória do Chelsea” é 1.7. O bookmaker acredita que o Chelsea tem 70 % de chances de vencer, mas tu achas que a probabilidade real é de 80 %. Verifiquemos: 1.7 × 0.8 = 1.36 > 1 — logo, é um Value Bet. ", "", "", "", "Mas aqui vem a questão principal: tens mesmo certeza desses 80 %? Talvez a probabilidade seja menor, e sejas apenas um grande fã do Chelsea FC. É por isso que conhecimento e intuição são essenciais no Value Betting.", "Baixo nível de risco", "Lucros elevados possíveis", "Nenhum problema com as casas de apostas", "Desvantagens:", "Difícil encontrar o evento certo", "Grande necessidade de disciplina e conhecimento", "Lucro apenas a longo prazo", ""};

    /* renamed from: f, reason: collision with root package name */
    public final String[] f9132f = {"Value Betting, uzun vadeli bir bahis stratejisidir ve burada amaç fazla değer biçilen oranları bulmaktır. Ne anlama geliyor? Bazı olayların kazanma olasılığı, bahis şirketinin düşündüğünden daha yüksektir. Senin görevin, spor bilgini ve deneyimini kullanarak bu olayları tespit etmektir. Bir olayın fazla değer biçilip biçilmediğini nasıl anlarsın? Şu matematiksel formülü kullan:", "", "", "K*P > 1,", "burada K bahis oranı, P ise senin tahmini kazanma olasılığındır. Örnek: Chelsea - Watford maçı. “Chelsea kazanır” oranı 1.7. Bahis şirketi, Chelsea’nin kazanma olasılığını %70 olarak görüyor. Ancak sen bunun %80 olduğunu düşünüyorsun. Kontrol edelim: 1.7 × 0.8 = 1.36 > 1 — bu bir Value Bet’tir. ", "", "", "", "Ama asıl soru şu: Gerçekten bu %80’den emin misin? Belki oran daha düşüktür ve sen sadece Chelsea taraftarısındır. İşte bu yüzden bilgi ve sezgi, Value Betting’de en önemli iki yardımcıdır.", "Düşük risk seviyesi", "Yüksek kâr potansiyeli", "Bahis siteleriyle sorun çıkmaz", "Dezavantajlar:", "Uygun etkinliği bulmak zor", "Öz disiplin ve bilgi çok önemli", "Kâr uzun vadede elde edilir", ""};

    /* renamed from: g, reason: collision with root package name */
    public final String[] f9133g = {"Value betting is a long-term betting strategy, where you should find overpriced odds. What does it mean? Some events have a larger chance of winning, than bookmaker think it is and your main task is to find these events using your experience and knowledges in sports. How to know this event overpriced or not? Use the following math formula:", "", "", "K*P > 1,", "where K – bookmakers odds, P – your chance of winning. Let’s take a look at an example. Here’s Chelsea against Watford game, where “1 Win” bet is 1.7 odds. So, bookmaker thinks, that chance of Chelsea’s winning today is 70%. But you think, the real chance of Chelsea’s winning is quite higher, maybe around 80%. So, check it: 1.7*0.8 = 1.36 > 1 – so, you can use value betting strategy. ", "", "", "", "But here is the main question: are you really sure about these 80%? Maybe, this chance is less than you think it is, and you are just a big fan of Chelsea FC? That’s why knowledges and intuition are two big helpers in value betting. Here are pluses of Value betting:", "Low risks level;", "You can take a big profit;", "No problems from bookmakers.", "Here are minuses:", "Quite difficult to find necessary event;", "Big role of self-discipline and knowledges;", "Profit only on long-term distance.", ""};

    public final String a(int i5, String language) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(language, "language");
        int hashCode = language.hashCode();
        if (hashCode == 3201) {
            if (language.equals("de")) {
                strArr = this.f9129c;
            }
            strArr = this.f9133g;
        } else if (hashCode == 3246) {
            if (language.equals("es")) {
                strArr = this.f9130d;
            }
            strArr = this.f9133g;
        } else if (hashCode == 3276) {
            if (language.equals("fr")) {
                strArr = this.f9128b;
            }
            strArr = this.f9133g;
        } else if (hashCode == 3588) {
            if (language.equals("pt")) {
                strArr = this.f9131e;
            }
            strArr = this.f9133g;
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && language.equals("tr")) {
                strArr = this.f9132f;
            }
            strArr = this.f9133g;
        } else {
            if (language.equals("ru")) {
                strArr = this.f9127a;
            }
            strArr = this.f9133g;
        }
        int i10 = i5 - 1;
        return (i10 >= strArr.length || i10 < 0) ? "" : strArr[i10];
    }
}
