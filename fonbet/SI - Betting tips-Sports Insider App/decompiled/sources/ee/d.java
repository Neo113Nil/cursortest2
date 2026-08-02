package ee;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f9120a = {"Под “коридором” в ставках обычно понимают комбинацию ставок на 2 близких события. Если повезет, то обе ставки могут оказаться выигрышными. Большую сложность составляет найти такой коридор, при котором выгода для игрока окажется максимальной. Чаще всего данная стратегия применяется в тех видах спорта, где можно ставить на тотал и фору.", "Разберем на примере. Игрок выбрал футбольный матч и делает две ставки: ТБ 2.5 и ТМ 3.5. Если команды забьют 4 и более, то выиграет только первая ставка. Если команды забьют 2 и менее - то выиграет только вторая ставка. А вот если команды забьют ровно 3 - то зайдут обе ставки, иными словами - она попадет в коридор между 2.5 и 3.5.", "К главным преимуществам данной стратегии относят:", "Возможность работать с небольшим стартовым капиталом", "Небольшой риск проигрыша", "При попадании в коридор есть вероятность выиграть довольно много", "К главным недостаткам данной стратегии относят:", "Банк игрока будет расти медленно (если вообще будет расти)", "Такие коридоры не так легко найти", "Есть вероятность того, что по результатам двух исходов вы окажетесь в минусе", "Немного теории и математики", "В стратегии коридор есть понятие коэффициента коридора - это отношение суммы потенциального выигрыша к сумме потенциального проигрыша. Как оценить вероятность попадания в этот самый коридор?", "Чтобы определить эту вероятность, необходимо посчитать сумму вероятностей для каждого из событий, а затем умножить на 100%. Опытные игроки обычно самостоятельно находят коридоры в разных букмекерских конторах, основываясь на своем опыте. Начинающим же капперам приходят на помощь различные сервисы поиска коридоров - они сканируют линии многих букмекерских контор и выдают результат в виде таблиц для более оперативного принятия решения."};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f9121b = {"Les paris en corridor consistent à placer des paris sur deux résultats opposés. Avec un peu de chance, les deux paris peuvent être gagnants. La principale difficulté est de trouver un corridor offrant le revenu final le plus élevé. Cette stratégie est particulièrement populaire dans les paris sur les totaux et les handicaps.", "", "Les principaux avantages des paris en corridor sont :", "La possibilité de commencer avec une petite bankroll", "Des risques relativement faibles", "Si le résultat tombe dans le corridor, le gain peut être très important", "Cependant, cette stratégie présente aussi des inconvénients évidents :", "La bankroll du joueur n’augmentera pas très rapidement", "Les corridors sont difficiles à trouver", "Il existe un risque de ne pas réaliser de bénéfice après deux paris", "", "", ""};

    /* renamed from: c, reason: collision with root package name */
    public final String[] f9122c = {"Beim Corridor-Betting werden zwei Wetten auf entgegengesetzte Ergebnisse platziert. Mit etwas Glück können beide Wetten gewinnen. Das Hauptproblem besteht darin, einen Corridor mit maximalem Ertrag zu finden. Diese Strategie wird besonders häufig bei Total- und Handicap-Wetten angewendet.", "", "Die wichtigsten Vorteile des Corridor-Bettings sind:", "Die Möglichkeit, mit einer kleinen Startbankroll zu spielen", "Relativ geringe Risiken", "Befindet sich das Ergebnis im Corridor, kann der Gewinn sehr hoch sein", "Diese Strategie hat jedoch auch einige offensichtliche Nachteile:", "Die Bankroll des Spielers wächst nicht sehr schnell", "Corridors sind schwer zu finden", "Es besteht eine hohe Wahrscheinlichkeit, nach zwei Wetten keinen Gewinn zu erzielen", "", "", ""};

    /* renamed from: d, reason: collision with root package name */
    public final String[] f9123d = {"Las apuestas en corredor consisten en realizar apuestas sobre dos resultados opuestos. Con un poco de suerte, ambas apuestas pueden resultar ganadoras. El principal problema es encontrar un corredor en el que el beneficio final sea máximo. Esta estrategia es más popular en apuestas de totales y hándicap.", "", "Las principales ventajas de las apuestas en corredor son:", "La posibilidad de empezar con un bankroll pequeño", "Riesgos relativamente bajos", "Si el resultado cae dentro del corredor, la ganancia puede ser muy alta", "Sin embargo, esta estrategia también tiene desventajas evidentes:", "El bankroll del jugador no crecerá muy rápido", "Los corredores son difíciles de encontrar", "Existe una alta probabilidad de no obtener beneficios tras dos apuestas", "", "", ""};

    /* renamed from: e, reason: collision with root package name */
    public final String[] f9124e = {"As apostas em corredor envolvem apostas em dois resultados opostos. Com um pouco de sorte, ambas as apostas podem ser vencedoras. O principal desafio é encontrar um corredor onde o lucro final seja máximo. Essa estratégia é mais popular em apostas de totais e handicaps.", "", "As principais vantagens das apostas em corredor são:", "A possibilidade de começar com uma banca inicial pequena", "Riscos relativamente baixos", "Se o resultado ficar dentro do corredor, o lucro pode ser muito alto", "No entanto, essa estratégia também possui desvantagens claras:", "A banca do jogador não cresce muito rápido", "Os corredores são difíceis de encontrar", "Existe uma grande chance de não haver lucro após duas apostas", "", "", ""};

    /* renamed from: f, reason: collision with root package name */
    public final String[] f9125f = {"Koridor bahisleri, zıt iki sonuca yapılan bahisleri ifade eder. Şanslı olunursa, her iki bahis de kazanabilir. En büyük sorun, en yüksek getiriyi sağlayacak bir koridor bulmaktır. Bu strateji özellikle toplam ve handikap bahislerinde popülerdir.", "", "Koridor bahislerinin başlıca avantajları şunlardır:", "Küçük bir başlangıç bakiyesiyle oynanabilmesi", "Görece düşük riskler", "Sonuç koridor içinde kalırsa kazanç oldukça yüksek olabilir", "Ancak bu stratejinin bazı belirgin dezavantajları da vardır:", "Oyuncunun bakiyesi çok hızlı artmaz", "Koridorları bulmak zordur", "İki bahis sonrasında kazanç elde edememe ihtimali yüksektir", "", "", ""};

    /* renamed from: g, reason: collision with root package name */
    public final String[] f9126g = {"Corridor betting is all about bets on two opposite results. If you get lucky, both bets will win. The main problem is to find corridor, where final income will be the biggest. This system is more popular in handicap and total bets. Here’s an example. Player picks two bets: Over 2.5 and Under 3.5. If teams score 4 goals or more, only first bet wins. If teams score 2 goals or less, only second bet wins. But if teams score only 3 goals – two bets win in the same time (inside the corridor of over 2.5 and under 3.5).", "", "The main pluses of corridor betting are:", "You can use it with small initial bank;", "Not big risks;", "If you are inside of corridor, your income may be very big.", "However, this system has some obvious minuses:", "Your bank won’t raise very fast;", "Corridors are hard to find;", "Big chance not to have income after two bets.", "", "", ""};

    public final String a(int i5, String language) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(language, "language");
        int hashCode = language.hashCode();
        if (hashCode == 3201) {
            if (language.equals("de")) {
                strArr = this.f9122c;
            }
            strArr = this.f9126g;
        } else if (hashCode == 3246) {
            if (language.equals("es")) {
                strArr = this.f9123d;
            }
            strArr = this.f9126g;
        } else if (hashCode == 3276) {
            if (language.equals("fr")) {
                strArr = this.f9121b;
            }
            strArr = this.f9126g;
        } else if (hashCode == 3588) {
            if (language.equals("pt")) {
                strArr = this.f9124e;
            }
            strArr = this.f9126g;
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && language.equals("tr")) {
                strArr = this.f9125f;
            }
            strArr = this.f9126g;
        } else {
            if (language.equals("ru")) {
                strArr = this.f9120a;
            }
            strArr = this.f9126g;
        }
        int i10 = i5 - 1;
        return (i10 >= strArr.length || i10 < 0) ? "" : strArr[i10];
    }
}
